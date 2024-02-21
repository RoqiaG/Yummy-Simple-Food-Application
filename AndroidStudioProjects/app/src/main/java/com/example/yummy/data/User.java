package com.example.yummy.data;
public class User {

    String name, password,  email;
    int phone,id;
    public User(int id,String name,String password,String email,int phone){
        this.id=id;
        this.name=name;
        this.password=password;
        this.email=email;
        this.phone=phone;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}