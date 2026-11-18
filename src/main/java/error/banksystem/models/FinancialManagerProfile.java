/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package error.banksystem.models;

/**
 *
 * @author Infotech
 */

public class FinancialManagerProfile {

    private Long managerId;
    private double maxLoanApprovalLimit;

    public FinancialManagerProfile() {
    }

    public FinancialManagerProfile(Long managerId,
                                   double maxLoanApprovalLimit) {
        this.managerId = managerId;
        this.maxLoanApprovalLimit = maxLoanApprovalLimit;
    }

    public Long getManagerId() {
        return managerId;
    }

    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    public double getMaxLoanApprovalLimit() {
        return maxLoanApprovalLimit;
    }

    public void setMaxLoanApprovalLimit(double maxLoanApprovalLimit) {
        this.maxLoanApprovalLimit = maxLoanApprovalLimit;
    }

    @Override
    public String toString() {
        return "FinancialManagerProfile{" +
                "managerId=" + managerId +
                ", maxLoanApprovalLimit=" + maxLoanApprovalLimit +
                '}';
    }
}
