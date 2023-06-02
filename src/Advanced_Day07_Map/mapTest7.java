package Advanced_Day07_Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class mapTest7 {

    public static void main(String[] args) {
        /*
        * 自动点名器1
        * 班级里有N个学生，实现随机点名器
        * */

        //创建集合
        ArrayList<String> list = new ArrayList<String> ();

        //添加元素
        Collections.addAll(list, "abc", "bcd", "cde");

        //打乱顺序
        Collections.shuffle(list);

        //打印结果
        System.out.println(list.get(0));


    }
}
