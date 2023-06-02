package Advanced_Day2_Interface;

public class payPlatformImpl implements paymentInterface{

    @Override
    public void payMethod(double amount) {
        System.out.println("通过支付平台支付了" + amount + "元！");
    }
}
