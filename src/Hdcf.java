public class Hdcf implements bankAccount{
    private int balance;
    public Hdcf(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean withDrawMoney(int money) {
        if(this.balance>money) return true;
        return false;
    }
}
