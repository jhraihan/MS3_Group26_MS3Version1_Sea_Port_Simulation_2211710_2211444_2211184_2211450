package com.example.sea_port_simulation.jahid_2211710;

import java.time.LocalDate;

public class UserAccount {
    private int userId;
    private String fullname,Email,role,username,password,accountStatus;
    private LocalDate lastLogin;

    public UserAccount(int userId, String fullname, String email, String role, String username, String password, String accountStatus, LocalDate lastLogin) {
        this.userId = userId;
        this.fullname = fullname;
        Email = email;
        this.role = role;
        this.username = username;
        this.password = password;
        this.accountStatus = accountStatus;
        this.lastLogin = lastLogin;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public LocalDate getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDate lastLogin) {
        this.lastLogin = lastLogin;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "userId=" + userId +
                ", fullname='" + fullname + '\'' +
                ", Email='" + Email + '\'' +
                ", role='" + role + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", accountStatus='" + accountStatus + '\'' +
                ", lastLogin=" + lastLogin +
                '}';
    }
}
