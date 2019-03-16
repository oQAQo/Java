package strategy;

public enum Paytype {

    ALI_PAY(new Alipay()),
    WINXIN_PAY(new WixinPay());

    private Pay pay;

    private Paytype(Pay pay) {
        this.pay = pay;
    }

    public Pay getPay() {
        return this.pay;
    }

}
