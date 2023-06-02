package Advanced_Day2_Interface;

import java.util.Scanner;

public class paymentTest {

    /*
    * 1.请选择支付方式：1.支付平台支付 2.银行卡网银支付 3.信用卡快捷支付
    * 2.请输入您的支付方式：2
    * 3.请输入您的支付金额：56.78
    * 4.通过银行卡网银支付了：56.78元！
    * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        paymentInterface payMethod = null;

        lo:
        while (true) {
            System.out.println("请选择支付方式：1.支付平台支付 2.银行卡网银支付 3.信用卡快捷支付 4.退出");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
//                    System.out.println("请选择支付方式：1.支付平台支付");
                    payMethod = new payPlatformImpl();
                    break lo;
                case 2:
//                    System.out.println("请选择支付方式：2.银行卡网银支付");
                    payMethod = new paymentBankImpl();
                    break lo;
                case 3:
//                    System.out.println("请选择支付方式：2.信用卡快捷支付");
                    payMethod = new paymentCreditImpl();
                    break lo;
                case 4:
                    System.out.println("退出成功！");
                    System.exit(0);
                default:
                    System.out.println("输入有误，请重新输入");
            }
        }

        System.out.println("请输入您的支付金额:");
        double amount = sc.nextDouble();

        payMethod.payMethod(amount);
    }
}
