/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package error.banksystem.models;

/**
 *
 * @author Infotech
 */
import java.time.LocalDate;
import error.banksystem.exceptions.EarlyWithdrawalException;
import error.banksystem.exceptions.InvalidAmountException;
import error.banksystem.exceptions.InsufficientFundsException;
public class CertificateOfDepositAccount extends Account {

    private double interestRate;
    private int termInMonths;
    private double earlyWithdrawalPenaltyRate;
    private LocalDate startDate;

    public CertificateOfDepositAccount(
            Long id,
            String accountNumber,
            double balance,
            User user,
            double interestRate,
            int termInMonths,
            double earlyWithdrawalPenaltyRate) {

        super(id, accountNumber, balance, user);

        this.interestRate = interestRate;
        this.termInMonths = termInMonths;
        this.earlyWithdrawalPenaltyRate =
                earlyWithdrawalPenaltyRate;

        this.startDate = LocalDate.now();
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Invalid amount"
            );
        }

        LocalDate maturityDate =
                startDate.plusMonths(termInMonths);

        if (LocalDate.now().isBefore(maturityDate)) {

            double penalty =
                    amount *
                    earlyWithdrawalPenaltyRate;

            throw new EarlyWithdrawalException(
                    "Early withdrawal. Penalty = "
                            + penalty
            );
        }

        if (amount > getBalance()) {
            throw new InsufficientFundsException(
                    "Insufficient funds"
            );
        }

        balance -= amount;
    }

    public double calculateMaturityAmount() {

        return getBalance() +
                (getBalance()
                        * interestRate
                        * termInMonths
                        / 12);
    }

}
