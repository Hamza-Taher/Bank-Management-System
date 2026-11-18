/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package error.banksystem.exceptions;

/**
 *
 * @author Infotech
 */
public class BelowMinimumBalanceException
        extends RuntimeException {

    public BelowMinimumBalanceException(String message) {
        super(message);
    }
}
