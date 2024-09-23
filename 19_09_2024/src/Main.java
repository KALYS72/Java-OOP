public class Main {
    public static void main(String[] args) {
        PersonalAccount account1 = new PersonalAccount("Alice Smith");
        PersonalAccount account2 = new PersonalAccount("Bob Johnson");

        account1.deposit(1000);
        account1.withdrawal(500);

        account2.deposit(2000);
        account2.withdrawal(2500);

        account1.getAccountHolder();
        account1.getNumberAccount();
        account1.getBalance();
        account1.printTransactionHistory();

        account2.getAccountHolder();
        account2.getNumberAccount();
        account2.getBalance();
        account2.printTransactionHistory();
    }
}