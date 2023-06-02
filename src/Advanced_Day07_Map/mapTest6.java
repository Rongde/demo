package Advanced_Day07_Map;

import org.w3c.dom.ls.LSOutput;

import java.nio.charset.StandardCharsets;
import java.util.TreeMap;

public class mapTest6 {

    public static void main(String[] args) {
        /*
        * 需求：字符串"aababcabcdabcde"
        * 请统计字符串中每一个字符串出现的次数，并按照以下格式输出
        * 输出结果：
        * a(5) b(4) c(3) d(2) e(1)
        * */
        
        //创建集合
        TreeMap<Character, Integer> map = new TreeMap<>();

        //添加元素
        String s = "aababcabcdabcde";
        char[] chars = s.toCharArray();

        for (char aChar : chars) {
            if (map.containsKey(aChar)) {
                Integer value = map.get(aChar);
                value += 1;
                map.put(aChar, value);
            } else {
                map.put(aChar, 1);
            }
        }

        //打印结果
//        map.forEach((key, value) -> System.out.print(key + "(" + value + ") "));

        StringBuilder sb = new StringBuilder();
        map.forEach((key, value) -> sb.append(key).append("(").append(value).append(") "));

        System.out.println(sb);
    }

}
