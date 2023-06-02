package Advanced_Day07_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class mapTest {

    public static void main(String[] args) {

        /*
        * 增强for循环遍历map集合
        * 迭代器遍历map集合
        * Lambda表达遍历map集合
        * */

        //1.创建集合
        HashMap<String, String> map = new HashMap<>();

        //2.添加元素
        map.put("Abc", "Acd");
        map.put("Bef", "Boe");
        map.put("Cmx", "Cqp");

        //3.遍历
        //第一种遍历(键找值)
        Set<String> keys = map.keySet();

        //增强for循环遍历map集合
        for (String key : keys) {
            System.out.println(key  + "=" + map.get(key));
        }

        //迭代器遍历map集合
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next + "=" +map.get(next));
        }

        //Lambda表达遍历map集合
        keys.forEach(s -> {
            System.out.println(s + "=" + map.get(s));
        });

        System.out.println("------------");

        //第二种遍历(键值对)
        Set<Map.Entry<String, String>> entries = map.entrySet();

        //增强for循环遍历map集合
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        //迭代器遍历map集合
        Iterator<Map.Entry<String, String>> it2 = entries.iterator();
        
        while (it.hasNext()) {
            Map.Entry<String, String> next = it2.next();
            System.out.println(next.getKey() + "=" + next.getValue());
        }

        //Lambda表达遍历map集合
        entries.forEach(s -> System.out.println(s.getKey() + "=" + s.getValue()));

        System.out.println("------------");

        //第三种遍历(Lambda表达式)
        map.forEach((key, value) -> System.out.println(key + "=" + value));

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {

            }
        });

        System.out.println("------------");

    }
}
