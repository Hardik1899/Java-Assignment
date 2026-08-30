public class Account{

    private String accountNumber;
    private String ownerName;
    private double balance;

    public Account(String accountNumber, String ownerName){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        balance = 0.0;
    }

    public Account(String accountNumber, String ownerName, double openingBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;

        if(openingBalance >= 0) {
            this.balance = openingBalance;
        } else {
            this.balance = 0.0;
        }
    }

    public boolean deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    // toString()
    @Override
    public String toString() {
        return "Account Number: " + accountNumber +
                ", Owner: " + ownerName +
                ", Balance: " + balance;
    }
}
