package Advanced_Day2_Interface;

public class paymentCreditImpl implements paymentInterface{
    @Override
    public void payMethod(double amount) {
        System.out.println("通过信用卡支付了" + amount + "元!");
    }
}
