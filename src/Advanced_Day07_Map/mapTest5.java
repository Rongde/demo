package Advanced_Day07_Map;

import java.util.TreeMap;

public class mapTest5 {

    public static void main(String[] args) {
        /*
        * 需求2：
        * 键：学生对象
        * 值：籍贯
        * 要求：按照学生年龄的升序排列，年龄一样按照姓名的字母排列，同姓名同年龄视为同一个人
        * */
        
        //创建对象
        TreeMap<Student, String> map = new TreeMap<>();

        //添加元素
        map.put(new Student("Abc",17),"AAA");
        map.put(new Student("Bcd",19),"BBB");
        map.put(new Student("Cde",17),"CCC");

        //打印结果
        System.out.println(map);

    }
}
