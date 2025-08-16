package com.example.sea_port_simulation.jahid_2211710;

public class Loginpage {
    private String title,userType,password;
    private int userID;

    public Loginpage(String title, String userType, String password, int userID) {
        this.title = title;
        this.userType = userType;
        this.password = password;
        this.userID = userID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return "Loginpage{" +
                "title='" + title + '\'' +
                ", userType='" + userType + '\'' +
                ", password='" + password + '\'' +
                ", userID=" + userID +
                '}';
    }
}
