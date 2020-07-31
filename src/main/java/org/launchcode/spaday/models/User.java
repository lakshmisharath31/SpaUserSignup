package org.launchcode.spaday.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {

    @NotBlank(message="user name cannot be blank!")
    @Size(min=5,max=15)
    private String username;

    @Email(message="please enter valid input!")
    private String email;

    @NotBlank
    @Size(min=6,message="your password should be of minimum 6 characters")
    private String password;

    @NotNull(message="Passwords do not match")
    private String verifyPassword;

    public User(String username, String email, String password,String verifyPassword) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
        this.verifyPassword=verifyPassword;
    }

    public User() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        checkPassword();
    }

    public String getVerifyPassword() {
        return verifyPassword;

    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
        checkPassword();
    }

    private void checkPassword(){
        if((getPassword() == null) && (getVerifyPassword() ==null) && (getPassword() != getVerifyPassword()) ){
            setVerifyPassword(null);
        }
    }
}
