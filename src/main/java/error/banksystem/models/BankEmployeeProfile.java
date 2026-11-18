/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package error.banksystem.models;

/**
 *
 * @author Infotech
 */
public class BankEmployeeProfile {

    private Long employeeId;
    private String department;
    private double salary;

    public BankEmployeeProfile() {
    }

    public BankEmployeeProfile(Long employeeId,
                               String department,
                               double salary) {
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "BankEmployeeProfile{" +
                "employeeId=" + employeeId +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
