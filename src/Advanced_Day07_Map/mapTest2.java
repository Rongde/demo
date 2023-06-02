package Advanced_Day07_Map;

import java.util.HashMap;

public class mapTest2 {

    public static void main(String[] args) {
        /*
        * 创建一个HashMap集合，键是学生对象(Student)，值是籍贯(String)
        * 存储三个键值对元素，并遍历
        * 要求：同姓名，同年龄认为是同一个学生
        * */
        
        //创建Map集合
        HashMap<Student, String> map = new HashMap<>();

        //添加对象
        map.put(new Student("张三",18),"广州");
        map.put(new Student("李四",19),"北京");
        map.put(new Student("张三",18),"广州");
        map.put(new Student("王五",20),"上海");

        //遍历
        map.forEach((key,value) -> System.out.println(key + "=" + value));

        //打印结果
        System.out.println(map);

    }
}
