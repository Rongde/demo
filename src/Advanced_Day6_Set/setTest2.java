package Advanced_Day6_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class setTest2 {

    public static void main(String[] args) {
        /*
        * 创建一个存储学生对象的集合，存储多个学生对象
        * 使用程序实现在控制台遍历该集合
        * 学生对象的成员变量值相同，我们就认为是同一个对象
        * */

//        HashSet<Student> set = new HashSet<>();
        LinkedHashSet<Student> set = new LinkedHashSet<>();

        System.out.println(set.add(new Student("张三", 26)));
        System.out.println(set.add(new Student("李四", 25)));
        System.out.println(set.add(new Student("王五", 27)));
        System.out.println(set.add(new Student("赵六", 28)));
        System.out.println(set.add(new Student("张三", 26)));

        System.out.println(set);

    }

}
