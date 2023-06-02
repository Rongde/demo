package Advanced_Day07_Map;

import java.util.Comparator;
import java.util.TreeMap;

public class mapTest4 {

    public static void main(String[] args) {
        /*
        * 需求1
        * 键：整数表示id
        * 值：字符串表示商品名称
        * 要求：按照id的升序排列、按照id的降序排列
        * */
        
        //创建集合
        TreeMap<Integer, String> map = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                int i = o1 - o2; //升序
                int i = o2 - o1; //降序
                return i;
            }
        });

        //添加元素
        map.put(1,"abc");
        map.put(3,"bcd");
        map.put(2,"cde");

        //打印结果
        System.out.println(map);
    }
}
