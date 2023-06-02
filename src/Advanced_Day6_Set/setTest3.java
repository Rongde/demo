package Advanced_Day6_Set;

import java.util.Iterator;
import java.util.TreeSet;

public class setTest3 {

    public static void main(String[] args) {
        /*
        * 存储整数并进行排序
        * */

        TreeSet<Integer> integers = new TreeSet<>();

        System.out.println(integers.add(1));
        System.out.println(integers.add(5));
        System.out.println(integers.add(2));
        System.out.println(integers.add(3));
        System.out.println(integers.add(3));

        System.out.println(integers);
        
        //遍历
        //迭代器
        Iterator<Integer> it = integers.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //增强for
        for (Integer integer : integers) {
            System.out.println(integer);
        }

        //lambda表达式
        integers.forEach(s -> System.out.println(s));
    }
}
