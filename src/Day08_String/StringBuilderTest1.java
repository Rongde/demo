package Day08_String;

import java.util.Scanner;

public class StringBuilderTest1 {

    public static void main(String[] args) {
        /*
        * 判断是否对称字符串，例如123321
        * */

        System.out.println("请输入字符串：");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (s.equals(new StringBuilder(s).reverse().toString())) {
            System.out.println("这是对称字符串");
        } else {
            System.out.println("这不是对称字符串");
        }

    }
}
