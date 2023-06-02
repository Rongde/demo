package Day09_Collection;

import java.util.ArrayList;

public class ArrayList2 {

    /*
    * 存储student集合并且打印低于18岁的学生信息
    * */

    public static void main(String[] args) {
        Student stu1 = new Student("123","张三", 25);
        Student stu2 = new Student("456","李四", 15);
        Student stu3 = new Student("789","王五", 14);

        ArrayList<Student> studentArrayList = new ArrayList<>();

        studentArrayList.add(stu1);
        studentArrayList.add(stu2);
        studentArrayList.add(stu3);

        for (int i = 0; i < studentArrayList.size(); i++) {
            Student student = studentArrayList.get(i);
            if (student.getAge() < 18) {
                System.out.println(student.toString());
            }
        }

    }
}
