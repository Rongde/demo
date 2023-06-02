package Day08_String;

import java.util.Scanner;

public class StringPhone {

    public static void main(String[] args) {
        /*
        * 11位手机号，保留前三位，保留后四位，屏蔽中间四位
        * */

        System.out.println("请输入11位手机号码");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (s.length() == 11) {
            String startSubstring = s.substring(0, 3);
            String endSubstring = s.substring(7);
            System.out.println("手机号码屏蔽后是：" + startSubstring + "****" + endSubstring);

        } else {
            System.out.println("输入手机号码长度有误！");
        }
    }
}
