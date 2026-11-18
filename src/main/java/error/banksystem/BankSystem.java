/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package error.banksystem;


/**
 *
 * @author Infotech
 */
import error.banksystem.models.User;
import error.banksystem.models.BankRequest;
import error.banksystem.models.Role;
import error.banksystem.models.RequestType;
import error.banksystem.models.Loan;
public class BankSystem {

    public static void main(String[] args) {

        User user = new User(
                1L,
                "hamza",
                "hamza@gmail.com",
                "123456",
                Role.USER,
                "01012345678"
        );

        BankRequest request =
                new BankRequest(
                        1L,
                        user,
                        RequestType.LOAN_REQUEST,
                        "Need a personal loan"
                );

        System.out.println(request);

        request.approve();

        System.out.println(request);

        Loan loan =
                new Loan(
                        1L,
                        user,
                        50000,
                        24
                );

        System.out.println(loan);

        loan.approve();

        System.out.println(loan);
    }
}

