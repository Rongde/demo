package Advanced_Day07_Map;

import java.util.*;

public class mapTest9 {

    public static void main(String[] args) {
        /*
        * 自动点名器3
        * 要求：
        * 被点到的学生不会再被点到
        * 但如果班级中所有的学生都点完了，需要开启第二轮点名
        * */

        //创建集合
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        HashSet<String> set = new HashSet<>();

        //添加元素
        Collections.addAll(list,"B1","B2","B3", "G1","G2","G3");
        Collections.addAll(list2,"B1","B2","B3", "G1","G2","G3");

        //复制元素
        Collections.copy(list2, list);

        //点名器
        Scanner sc = new Scanner(System.in);
        int i = 0;
        String name;
        int j = 1;
        System.out.println("第" + j + "轮点名开始");

        while (i != 2) {
            System.out.println("--------点名器--------");
            System.out.println("1.点名 2.退出");
            i = sc.nextInt();
            if (i == 1) {
                //判断是否已经点完名
                if (list2.size() == 0) {
                    j ++;
                    System.out.println("第" + j + "轮点名开始");
                    Collections.copy(list2, list);
                }

                int index = new Random().nextInt(list2.size());
                System.out.println(list2.remove(index));
                list2.remove(index);
            } else if (i == 2) {
                System.out.println("成功退出！");
                break;
            } else {
                System.out.println("输入错误,请重新输入");
            }
        }
    }
}
