package strategy;

import javax.sound.midi.Soundbank;

public class Order {

    private String orderNo;

    private String price;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Order order = new Order();
        order.price="11.11";
        order.orderNo="2018010101111";

       Pay pay=  Paytype.ALI_PAY.getPay();
       Paystate state= pay.pay(order);

        System.out.println(state.toString());
    }

}
