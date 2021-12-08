package lesson10;

public class СonverterLauncher {

    public static void main(String[] args) {
        AccountBank alexDem = new AccountBank(0, "Alex Dem");
        alexDem.replenish(1_000_000);
        alexDem.withdraw(100_000);
        System.out.println("Состояние счета " + alexDem.getOwnerAccount() + ": " + alexDem.getBalance());
        System.out.println("Состояние счета в долларах " + alexDem.balanceInDollars());
        System.out.println("Состояние счета в евро " + alexDem.balanceInEur());
        System.out.println("Состояние счета в юанях " + alexDem.balanceInCny());
        System.out.println("Состояние счета в " + alexDem.changeCourseEnum();
    }

}
