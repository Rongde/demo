package Advanced_Day2_Interface;

public class paymentBankImpl implements paymentInterface{
    @Override
    public void payMethod(double amount) {
        System.out.println("通过银行卡网银支付了" + amount + "元！");
    }
}
