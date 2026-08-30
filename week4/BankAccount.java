public class BankAccount{
    public static void main(String[] args) {

        Account account1 = new Account("A1", "Manmohan");

        Account account2 = new Account("A2", "Lalbahadur Shastri", 5000.0);

        account1.deposit(1000);
        account1.withdraw(300);

        account2.deposit(2000);
        account2.withdraw(1000);

        System.out.println(account1);
        System.out.println(account2);

        System.out.println("Account 1 Balance: " + account1.getBalance());
        System.out.println("Account 2 Balance: " + account2.getBalance());
    }
}