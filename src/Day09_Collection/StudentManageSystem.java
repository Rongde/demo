package Day09_Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManageSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> stuArray = new ArrayList<>();

        lo:
        while (true) {
            System.out.println("----------欢迎来到学生管理系统----------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看学生");
            System.out.println("5.退出");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addInfo(stuArray);
                    break;
                case 2:
                    removeInfo(stuArray);
                    break;
                case 3:
                    updateInfo(stuArray);
                    System.out.println("3.修改学生");
                    break;
                case 4:
                    queryAllInfo(stuArray);
                    break;
                case 5:
                    System.out.println("5.退出");
                    break lo;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }


    }

    private static void updateInfo(ArrayList<Student> stuArray) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改学生的学号：");
        String id = sc.next();

        int index = queryById(stuArray, id);

        if (index != -1) {
            System.out.println("请输入修改学生的姓名：");
            String name = sc.next();
            System.out.println("请输入修改学生的年龄：");
            int age = sc.nextInt();

            stuArray.set(index, new Student(id, name, age));
        } else {
            System.out.println("查无此学生，修改失败");
        }
    }

    private static void removeInfo(ArrayList<Student> stuArray) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入删除学生学号：");
        String id = sc.next();

         int index = queryById(stuArray, id);

         if (index != -1) {
             stuArray.remove(index);
             System.out.println(id + " 删除成功");
         } else {
             System.out.println("查无此号，删除失败");
         }

    }

    private static int queryById(ArrayList<Student> stuArray, String id) {
        for (int i = 0; i < stuArray.size(); i++) {
            if (id.equals(stuArray.get(i).getId())) {
                return i;
            }
        }

        return -1;
    }

    private static void queryAllInfo(ArrayList<Student> stuArray) {
        if (stuArray.size() != 0 ) {
            for (int i = 0; i < stuArray.size(); i++) {
                System.out.println(stuArray.get(i).toString());
            }
        } else {
            System.out.println("无任何学生信息，请添加学生信息");
        }


    }

    private static void addInfo(ArrayList<Student> stuArray) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("请输入学生学号：");
        String id = sc.nextLine();

        int index = queryById(stuArray, id);

        if (index == -1) {
            System.out.println("请输入学生姓名：");
            String name = sc.nextLine();

            System.out.println("请输入学生年龄：");
            int age = sc.nextInt();

            stuArray.add(new Student(id, name, age));
        } else {
            System.out.println("学号已存在，添加失败");
        }


    }
}
