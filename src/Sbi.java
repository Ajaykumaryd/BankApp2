public class Sbi implements bankAccount {

//    int minBalance;
    private int roi;
    private int balance;
    private String AccountNumber;

    public int getRoi() {
        return roi;
    }

    public Sbi(int roi, int balance) {
        this.roi = roi;
        this.balance = balance;

    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setRoi(int roi) {
        this.roi = roi;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean addMoney(int money) {
        this.balance+=money;
        return true;
    }

    @Override
    public int checkBalance() {
        return this.balance;
    }

    @Override
    public int ROI() {
        return this.roi;
    }

    @Override
    public int getTotalInterest(int amount, int time) {
        return amount*time*roi/100;
    }

    @Override
    public boolean withDrawMoney(int money) {


        return false;
    }
}