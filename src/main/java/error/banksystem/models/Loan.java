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

public class Loan {

    private Long id;
    private User borrower;
    private double amount;
    private int repaymentMonths;
    private LoanStatus status;
    private LocalDate createdDate;

    public Loan(Long id,
                User borrower,
                double amount,
                int repaymentMonths) {

        this.id = id;
        this.borrower = borrower;
        this.amount = amount;
        this.repaymentMonths = repaymentMonths;
        this.status = LoanStatus.PENDING;
        this.createdDate = LocalDate.now();
    }

    public void approve() {
        status = LoanStatus.APPROVED;
    }

    public void reject() {
        status = LoanStatus.REJECTED;
    }

    public void markAsPaid() {
        status = LoanStatus.PAID;
    }

    public LoanStatus getStatus() {
        return status;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {

        return "Loan{" +
                "id=" + id +
                ", amount=" + amount +
                ", repaymentMonths=" + repaymentMonths +
                ", status=" + status +
                '}';
    }
}
