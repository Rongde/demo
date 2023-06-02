package Day08_String;

import java.util.Scanner;

public class StringLogin {

    public static void main(String[] args) {
        /*
         * 1.预设用户名密码
         * 2.用户输入用户名密码，登陆三次失败退出。
         * */

        String name = "admin";
        String passwd = "123";

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入用户名：");
            String inputName = sc.nextLine();

            System.out.println("请输入密码：");
            String inputPasswd = sc.nextLine();

            if (name.equals(inputName) && passwd.equals(inputPasswd)) {
                System.out.println("登陆成功");
                break;
            } else {
                if (i == 3) {
                    System.out.println("3次登陆失败，请稍后再试！");
                } else {
                    System.out.println("登陆失败，重试次数剩余" + (3 - i) + "次");
                }
            }
        }


    }
}
