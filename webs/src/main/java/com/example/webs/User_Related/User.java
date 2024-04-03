package com.example.webs.User_Related;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class User {
    @Id
    public String username;
    @Column
    public String password;
    @Column
    public int VirtualPoints = 10000;
    public User(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
    public User()
    {}
    public String getusername()
    {
        return this.username;
    }
    public static void main(String[] args)
    {
        System.out.println("Hello");
    }

}
