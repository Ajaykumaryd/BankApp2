public class Sbi implements bankAccount {


    @Override
    public boolean addMoney(int money) {
        return false;
    }

    @Override
    public int checkBalance() {
        return 0;
    }

    @Override
    public int ROI() {
        return 0;
    }

    @Override
    public int getTotalInterest(int amount, int time) {
        return 0;
    }

    @Override
    public boolean withDrawMoney(int money) {
        return false;
    }
}