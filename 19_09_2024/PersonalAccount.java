import java.util.ArrayList;

public class PersonalAccount {
    public int accountNumber;
    public static int counter = 0;
    public String accountHolder;
    private double balance;
    private final ArrayList<Amount> transactions = new ArrayList<>();

    PersonalAccount(String accountHolder) {
        this.accountHolder = accountHolder;
        this.accountNumber = ++counter;
    }

    public void deposit(double amount) {
        Amount newAmount = new Amount(amount, TransactionType.DEPOSIT);
        transactions.add(newAmount);
        balance += amount;
        System.out.println("Done!");
    }

    public void withdrawal(double amount) {
        if (balance >= amount) {
            Amount newAmount = new Amount(amount, TransactionType.WITHDRAWAL);
            transactions.add(newAmount);
            balance -= amount;
            System.out.println("Done!");
        } else {
            System.out.println("You dont have enough money in your account!");
        }
    }

    public void printTransactionHistory() {
        for (Amount transaction : transactions) {
            System.out.println("TRANSACTION TYPE: " + transaction.transactionType + ". AMOUNT: " + transaction.Amount);
        }
    }

    public void getBalance() {
        System.out.println("You have " + balance + " Money");
    }

    public void getNumberAccount() {
        System.out.println("Your ID is: " + accountNumber);
    }

    public void getAccountHolder() {
        System.out.println("Your Name is: " + accountHolder);
    }
}