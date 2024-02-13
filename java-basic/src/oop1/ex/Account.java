package oop1.ex;

public class Account {
    int balance;
    int amount;

    int deposit() {
        return balance += amount;
    }

    int withdraw() {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("잔액이 부족합니다.");
        } return balance;
    }

    void printAccount() {
        System.out.println("잔고: " + balance);
    }

}
