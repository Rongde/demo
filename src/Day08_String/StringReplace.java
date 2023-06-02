package Day08_String;

import java.util.Scanner;

public class StringReplace {

    /*
    * 屏蔽敏感词'TMD'
    * */

    public static void main(String[] args) {
        System.out.println("请输入句子：");
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String content = s.replace("TMD", "***");

        System.out.println("屏蔽后的句子是: " + content);

    }
}
