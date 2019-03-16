package strategy;

public class Alipay implements Pay {


    public Paystate pay(Order order) {
        Paystate payment = new Paystate();
        payment.setOrderNo(order.getOrderNo());
        payment.setPayType("支付宝");
        payment.setPrice(order.getPrice());
        return payment;

    }
}
