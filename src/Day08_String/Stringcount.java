package Day08_String;

import java.util.Scanner;

public class Stringcount {

    /*
    * 统计字符串小写字母，大写字母，数字的个数
    * */

    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z' ) {
                bigCount ++;
            } else if (chars[i] >= 'a' && chars[i] <= 'z' ) {
                smallCount ++;
            } else if (chars[i] >= '0' && chars[i] <= '9' ) {
                numCount ++;
            }
        }

        System.out.println("一共有" + bigCount + "个大写字母，" + smallCount + "个小写字母，" + numCount + "个数字");
        
    }



    
}
