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
import error.banksystem.exceptions.BelowMinimumBalanceException;
public class MoneyMarketAccount extends Account {

    private double minimumBalance;

    public MoneyMarketAccount(Long id,
                              String accountNumber,
                              double balance,
                              User user,
                              double minimumBalance) {

        super(id, accountNumber, balance, user);
        this.minimumBalance = minimumBalance;
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Invalid amount"
            );
        }

        if ((getBalance() - amount) < minimumBalance) {

            throw new BelowMinimumBalanceException(
                    "Cannot go below minimum balance"
            );
        }

        balance -= amount;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }
}