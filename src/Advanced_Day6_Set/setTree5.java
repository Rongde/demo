package Advanced_Day6_Set;

import java.util.Comparator;
import java.util.TreeSet;

public class setTree5 {

    public static void main(String[] args) {
        /*
        * 需求：请自行选择比较器排序和自然排序两种方式
        * 要求：存入四个字符串，"c","ab","df","qwer"
        * 按照长度排序，如果一样长则按照首字母排序
        * */

        //1创建集合
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            //o1:表示当前要添加的元素
            //o2:表示已经在红黑树的元素
            public int compare(String o1, String o2) {
                int i = o1.length() - o2.length();

                i = i == 0 ? o1.compareTo(o2) : i;
                return i;
            }
        });

        //添加元素
        ts.add("abc");
        ts.add("bcd");
        ts.add("cde");

        //打印结果
        System.out.println(ts);

    }
}
