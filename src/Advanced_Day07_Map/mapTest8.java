package Advanced_Day07_Map;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class mapTest8 {

    public static void main(String[] args) {
        /*
        * 自动点名器2
        * 要求：
        * 70%的概率随机到男生
        * 30%的概率随机到女生
        * */

        //创建集合
        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();

        //添加集合
        Collections.addAll(boyList,"B1","B2","B3");
        Collections.addAll(girlList,"G1","G2","G3");

        //概率生成器
        ArrayList<Integer> iList = new ArrayList<>();
        Collections.addAll(iList, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0);

        Integer select = iList.get(new Random().nextInt(iList.size()));

        //点名器
        if (select == 1) {
            System.out.println(boyList.get(new Random().nextInt(boyList.size())));
        } else {
            System.out.println(girlList.get(new Random().nextInt(girlList.size())));
        }


    }
}
