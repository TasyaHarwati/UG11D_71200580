package com.ug11.soal1;

public class UserException {
    private String username;
    private String email;
    private String password;

    public UserException (String username,String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public getUsername(){
        return username;
    }

}
