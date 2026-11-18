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
public class SavingsAccount extends Account {

    private double interestRate;
    private int withdrawalLimitPerMonth;

    public SavingsAccount(Long id,
                          String accountNumber,
                          double balance,
                          User user,
                          double interestRate,
                          int withdrawalLimitPerMonth) {

        super(id,
              accountNumber,
              balance,
              user);

        this.interestRate = interestRate;
        this.withdrawalLimitPerMonth =
                withdrawalLimitPerMonth;
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Invalid amount"
            );
        }

        if (amount > getBalance()) {
            throw new InsufficientFundsException(
                    "Insufficient balance"
            );
        }

        balance -= amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getWithdrawalLimitPerMonth() {
        return withdrawalLimitPerMonth;
    }
}
