/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package error.banksystem.models;

/**
 *
 * @author Infotech
 */
import error.banksystem.exceptions.InvalidAmountException;
import error.banksystem.exceptions.InsufficientFundsException;
public class Wallet {

    private Long id;
    private User owner;
    private double balance;
    private WalletStatus status;

    public Wallet(Long id,
                  User owner,
                  double balance) {

        this.id = id;
        this.owner = owner;
        this.balance = balance;
        this.status = WalletStatus.ACTIVE;
    }

    public void deposit(double amount) {

        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Invalid amount"
            );
        }

        balance += amount;
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Invalid amount"
            );
        }

        if (amount > balance) {
            throw new InsufficientFundsException(
                    "Insufficient balance"
            );
        }

        balance -= amount;
    }

    public void freezeWallet() {
        status = WalletStatus.FROZEN;
    }

    public void activateWallet() {
        status = WalletStatus.ACTIVE;
    }

    public Long getId() {
        return id;
    }

    public User getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public WalletStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "id=" + id +
                ", balance=" + balance +
                ", status=" + status +
                '}';
    }
}
