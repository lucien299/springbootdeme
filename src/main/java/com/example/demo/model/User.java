package com.example.demo.model;

import lombok.Data;
import lombok.Getter;

import java.sql.ClientInfoStatus;
import java.util.List;

@Data
public class User {
    private int id;
    private String username;
    private int cardid;
    private String email;

    public User(int id, String username, int cardid, String email){
        this.id = id;
        this.username = username;
        this.cardid = cardid;
        this.email = email;
    }

    public User(String username, int cardid, String email){
        this.username = username;
        this.cardid = cardid;
        this.email = email;
    }

    public User(){
    }




}

