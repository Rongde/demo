package Day09_Collection;

import java.util.ArrayList;

public class ArrayListTest1 {

    public static void main(String[] args) {
        /*
        * 存储并展示{1.1, 1.2, 1.3}
        * */

        ArrayList<Double> list1 = new ArrayList<>();
        list1.add(1.1);
        list1.add(1.2);
        list1.add(1.3);
        System.out.println(list1);
        
        /*
        * 存储并展示{"张三"，"李四"，"王五"}
        * */

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("张三");
        list2.add("李四");
        list2.add("王五");
        System.out.println(list2);
    }
}
