/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package error.banksystem.models;

/**
 *
 * @author Infotech
 */
import java.time.LocalDateTime;
import error.banksystem.exceptions.InvalidAmountException;
public abstract class Account {

    private Long id;
    private String accountNumber;
    protected double balance;
    private User user;
    private LocalDateTime createdAt;

    public Account(Long id,
                   String accountNumber,
                   double balance,
                   User user) {

        this.id = id;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.user = user;
        this.createdAt = LocalDateTime.now();
    }

    public void deposit(double amount) {

        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Amount must be greater than zero"
            );
        }

        balance += amount;
    }

    public abstract void withdraw(double amount);

    public Long getId() {
        return id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
