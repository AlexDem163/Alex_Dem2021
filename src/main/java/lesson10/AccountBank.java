package lesson10;

public class AccountBank {

    private double balance;
    private String ownerAccount;

    public AccountBank(double balance, String ownerAccount) {
        this.balance = balance;
        this.ownerAccount = ownerAccount;
    }

    public void replenish(double money) {
        balance += money;
    }

    public boolean withdraw(double money) {
        if (this.balance >= money) {
            balance -= money;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public double balanceInDollars() {
        return this.getBalance() / Course.USD;
    }

    public double balanceInEur() {
        return this.getBalance() / Course.EUR;
    }

    public double balanceInCny() {
        return this.getBalance() / Course.CNY;
    }

    public void changeCourseEnum(CourseEnum cours) {
        switch (cours) {
            case EURR -> (this.getBalance() / Course.EUR);
            case USDD -> (this.getBalance() / Course.USD);
            case CNYY -> (this.getBalance() / Course.CNY);
        }
    }
}

