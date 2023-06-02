package Advanced_Day07_Map;

import java.util.*;

public class mapTest3 {

    public static void main(String[] args) {
        /*
        * 某个班级80名学生，现在需要组成秋游活动，班长提供了四个景点依次是(A,B,C,D)，每个学生只
        * 能选择一个景点，请统计出最终哪儿个景点想去的人数最多。
        * */
        
        //创建map集合
        HashMap<String, Integer> map = new HashMap<>();

        //添加对象
        //模拟学生投票
        String[] arr = {"A", "B", "C", "D"};
        //ArrayList存储结果
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 80; i++) {
            list.add(arr[new Random().nextInt(arr.length)]);
        }

        //统计结果
        int count;

        for (String s : list) {
            if (map.containsKey(s)) {
                count = map.get(s);
                count++;
                map.put(s, count);
            } else {
                map.put(s, 1);
            }
        }

        System.out.println(map);

        //找出最大值
        String maxName = null;
        int maxInt = 0;
        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() > maxInt) {
                maxInt = entry.getValue();
                maxName = entry.getKey();
            }
        }

        System.out.println("最多投票的景点是：" + maxName + " 一共获得：" + maxInt + "票");

    }
}
