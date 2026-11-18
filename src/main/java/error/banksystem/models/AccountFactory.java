/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package error.banksystem.models;

/**
 *
 * @author Infotech
 */
public class AccountFactory {

    public static Account createCheckingAccount(
            Long id,
            String accountNumber,
            double balance,
            User user,
            double overdraftLimit) {

        return new CheckingAccount(
                id,
                accountNumber,
                balance,
                user,
                overdraftLimit
        );
    }

    public static Account createMoneyMarketAccount(
            Long id,
            String accountNumber,
            double balance,
            User user,
            double minimumBalance) {

        return new MoneyMarketAccount(
                id,
                accountNumber,
                balance,
                user,
                minimumBalance
        );
    }

    public static Account createSavingsAccount(
            Long id,
            String accountNumber,
            double balance,
            User user,
            double interestRate,
            int withdrawalLimitPerMonth) {

        return new SavingsAccount(
                id,
                accountNumber,
                balance,
                user,
                interestRate,
                withdrawalLimitPerMonth
        );
    }
}