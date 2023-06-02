package Day09_Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest2 {

    /*
    * 存储三个学生的信息，并打印出来
    * */

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            addArrayList(list);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i).toString());
        }



    }

    private static void addArrayList(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的学号：");
        String id = sc.next();
        System.out.println("请输入学生的姓名：");
        String name = sc.next();
        System.out.println("请输入学生的年龄");
        int age = sc.nextInt();

        Student student = new Student(id, name, age);
        list.add(student);
    }
}
