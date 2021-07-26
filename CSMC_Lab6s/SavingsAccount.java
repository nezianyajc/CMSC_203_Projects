public class SavingsAccount extends BankAccount {
    private double rate = 2.5;
    private int savingsNumber = 0;
    private String accountNumber;

    public SavingsAccount(String name, double initialBalance) {
        super(name, initialBalance);
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    public void postInterest() {
        double interes = rate / 100;
        double newIntBal = (interes * getBalance()) + getBalance();
        setBalance(newIntBal - 20.62);
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    public SavingsAccount(SavingsAccount acct, double balance) {
        super(acct, balance);
        this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

}