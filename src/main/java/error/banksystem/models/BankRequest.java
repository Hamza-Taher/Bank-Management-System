/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package error.banksystem.models;

/**
 *
 * @author Infotech
 */

import java.time.LocalDateTime;

public class BankRequest {

    private Long id;
    private User user;
    private RequestType requestType;
    private RequestStatus status;
    private String description;
    private LocalDateTime createdAt;

    public BankRequest(Long id,
                       User user,
                       RequestType requestType,
                       String description) {

        this.id = id;
        this.user = user;
        this.requestType = requestType;
        this.description = description;
        this.status = RequestStatus.PENDING;
        this.createdAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public RequestStatus getStatus() {
        return status;
    }

    public void approve() {
        status = RequestStatus.APPROVED;
    }

    public void reject() {
        status = RequestStatus.REJECTED;
    }

    @Override
    public String toString() {

        return "BankRequest{" +
                "id=" + id +
                ", requestType=" + requestType +
                ", status=" + status +
                ", description='" + description + '\'' +
                '}';
    }
}