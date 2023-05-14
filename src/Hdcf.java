import java.util.UUID;

public class Hdcf implements bankAccount{

    private int roi;
    private int balance;
    private String AccountNumber;

    public String getAccountNumber() {
        return AccountNumber;
    }

    public int getRoi() {
        return roi;
    }

    public void setRoi(int roi) {
        this.roi = roi;
    }


    public Hdcf(int balance) {
        this.balance = balance;
        this.AccountNumber= String.valueOf(UUID.randomUUID());
        this.roi=5;
    }

    public Hdcf(int roi, int balance) {
        this.roi = roi;
        this.balance = balance;
        this.AccountNumber= String.valueOf(UUID.randomUUID());
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
        if(this.balance>money) return true;
        return false;
    }
}
