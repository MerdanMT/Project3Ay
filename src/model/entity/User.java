package model.entity;

import model.enums.UserPosition;

public class User extends Person{
    private int age;
    private String isYeri;
    private String dogumYeri;
    private UserPosition position;


    public User(int id, String username, String password, String email, String phone, int age, String isYeri, String dogumYeri,UserPosition position) {
        super(id, username, password, email, phone);
        this.age = age;
        this.isYeri = isYeri;
        this.dogumYeri = dogumYeri;
        this.position = position;
    }

    public User(int age, String isYeri, String dogumYeri) {
        this.age = age;
        this.isYeri = isYeri;
        this.dogumYeri = dogumYeri;
    }
    public User(){

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIsYeri() {
        return isYeri;
    }

    public void setIsYeri(String isYeri) {
        this.isYeri = isYeri;
    }

    public String getDogumYeri() {
        return dogumYeri;
    }

    public void setDogumYeri(String dogumYeri) {
        this.dogumYeri = dogumYeri;
    }

    public UserPosition getPosition() {
        return position;
    }

    public void setPosition(UserPosition position) {
        this.position = position;
    }


    @Override
    public String toString() {
        return "User{" +super.toString()+
                "age=" + age +
                ", isYeri='" + isYeri + '\'' +
                ", dogumYeri='" + dogumYeri + '\'' +
                ", position=" + position +
                "} ";
    }
}
