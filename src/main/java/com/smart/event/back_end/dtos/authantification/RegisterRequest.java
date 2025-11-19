package com.smart.event.back_end.dtos.authantification;


public class RegisterRequest {
    private String userName;
    private String email;
    private String password;

    // Getters
    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    // Setters
    public void setUserName(String username) {
        this.userName = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
