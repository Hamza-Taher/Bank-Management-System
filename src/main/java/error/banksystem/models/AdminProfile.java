/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package error.banksystem.models;

/**
 *
 * @author Infotech
 */

public class AdminProfile {

    private Long adminId;
    private String adminLevel;

    public AdminProfile() {
    }

    public AdminProfile(Long adminId,
                        String adminLevel) {
        this.adminId = adminId;
        this.adminLevel = adminLevel;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public String getAdminLevel() {
        return adminLevel;
    }

    public void setAdminLevel(String adminLevel) {
        this.adminLevel = adminLevel;
    }

    @Override
    public String toString() {
        return "AdminProfile{" +
                "adminId=" + adminId +
                ", adminLevel='" + adminLevel + '\'' +
                '}';
    }
}
