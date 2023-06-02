package Advanced_Day07_Map;

import java.util.*;

public class mapTest11 {

    public static void main(String[] args) {
        /*
         * 需求：定义一个Map集合，键用表示省份名称province,值表示市city,但是市会有多个
         * 添加完毕后，遍历结果如下：
         * 江苏省=南京市，扬州市，苏州市，无锡市，常州市
         * 湖北省=武汉市，孝感市，十堰市，宜昌市，鄂州市
         * 河北省=石家庄市，唐山市，邢台市，保定市，张家口市
         * */

        //创建集合
        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        //添加元素
        ArrayList<String> city1 = new ArrayList<>();
        Collections.addAll(city1, "南京市", "扬州市", "苏州市", "无锡市", "常州市");

        ArrayList<String> city2 = new ArrayList<>();
        Collections.addAll(city2, "武汉市", "孝感市", "十堰市", "宜昌市", "鄂州市");

        ArrayList<String> city3 = new ArrayList<>();
        Collections.addAll(city3, "石家庄市", "唐山市", "邢台市", "保定市", "张家口市");

        hm.put("江苏省", city1);
        hm.put("湖北省", city2);
        hm.put("河北省", city3);

        //打印结果
        Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();

        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            String province = entry.getKey();
            ArrayList<String> cities = entry.getValue();

            StringJoiner sj = new StringJoiner(",", "", "");
            for (String city : cities) {
                sj.add(city);
            }
            System.out.println(province + "=" + sj);
        }
    }
}
