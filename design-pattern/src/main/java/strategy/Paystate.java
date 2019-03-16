package strategy;

public class  Paystate {


    private String orderNo;

    private String price;

    private String payType;

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayType() {
        return payType;
    }

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

    @Override
    public String toString() {
        return "Payment{" +
                "orderNo='" + orderNo + '\'' +
                ", price='" + price + '\'' +
                ", payType='" + payType + '\'' +
                '}';
    }
}
