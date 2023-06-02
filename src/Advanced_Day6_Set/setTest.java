package Advanced_Day6_Set;

import java.util.HashSet;
import java.util.Iterator;

public class setTest {

    /*
    * 利用Set系列的集合，添加字符串，并使用多种方式遍历
    * 迭代器
    * 增强for
    * Lambda表达式
    * */

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("abc");
        set.add("bcd");
        set.add("cde");

        /*迭代器*/
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        /*增强for*/
        for (String s : set) {
            System.out.println(s);
        }

        /*Lambda表达式*/
        set.forEach(s -> System.out.println(s));

    }
}
