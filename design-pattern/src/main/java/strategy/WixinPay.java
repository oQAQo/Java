package strategy;

public class WixinPay implements Pay {

    public Paystate pay(Order order) {
        Paystate payment = new Paystate();
        payment.setOrderNo(order.getOrderNo());
        payment.setPayType("微信支付");
        payment.setPrice(order.getPrice());
        return payment;

    }
}
