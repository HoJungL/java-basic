package access.b;

public class BankAccount {

    private int balance;
    // Alt + ins 눌러봐 그럼 바로 나와

    public BankAccount() {
        balance = 0;
    }

    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    public void widthraw(int amount) {
        if (isAmountValid(amount) && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나, 잔액이 부족합니다.");
        }
    }

    //public 메소드 : getBalance
    public int getBalance() {
        return balance;
    }

    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야합니다.
        return amount > 0;
    }
}
