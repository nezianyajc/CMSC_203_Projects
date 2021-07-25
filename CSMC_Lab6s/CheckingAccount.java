public class CheckingAccount extends BankAccount {
    private static double FEE = .15;
    private String name;
    private int initialAmount;

    public CheckingAccount(String nam, int iniAmount) {
        super();
        this.name = nam;
        this.initialAmount = iniAmount;
    }
}