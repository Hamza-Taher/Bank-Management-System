/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package error.banksystem.exceptions;

/**
 *
 * @author Infotech
 */
public class SameAccountTransferException
        extends RuntimeException {

    public SameAccountTransferException(String message) {
        super(message);
    }
}
