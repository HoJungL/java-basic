package access.b;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10000);
        account.widthraw(3000);
        System.out.println("잔액: " + account.getBalance());
    }
}
