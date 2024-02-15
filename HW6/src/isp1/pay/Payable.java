package isp1.pay;

public interface Payable {
    void payWebMoney(int amount);

    void payCreditCard(int amount);
}
