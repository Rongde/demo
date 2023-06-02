package Advanced_Day6_Set;

import java.util.TreeSet;

public class setTest4 {

    public static void main(String[] args) {
        /*
        * 需求：创建TreeSet集合，并添加3个学生集合
        * 学生对象属性：姓名，年龄
        * 要求按照学生的年龄进行排序
        * 同年龄按照姓名字母排序
        * 同姓名，同年龄认为是同一个人
        * */

        //1.建立TreeSet集合
        TreeSet<Student2> students = new TreeSet<>();

        //2.在集合里添加对象
        students.add(new Student2("Zhang San",18));
        students.add(new Student2("Li Si",19));
        students.add(new Student2("Zhang San",18));
        students.add(new Student2("Wang Wu",18));
        students.add(new Student2("Zhao Liu",16));

        //3.打印结果
        System.out.println(students);



    }
}
