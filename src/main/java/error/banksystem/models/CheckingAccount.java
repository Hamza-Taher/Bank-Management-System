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
import error.banksystem.exceptions.OverdraftLimitExceededException;
public class CheckingAccount extends Account {

    private double overdraftLimit;

    public CheckingAccount(Long id,
                           String accountNumber,
                           double balance,
                           User user,
                           double overdraftLimit) {
        super(id, accountNumber, balance, user);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Invalid amount"
            );
        }

        if (amount > getBalance() + overdraftLimit) {
            throw new OverdraftLimitExceededException(
                    "Overdraft limit exceeded"
            );
        }

        balance -= amount;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}
