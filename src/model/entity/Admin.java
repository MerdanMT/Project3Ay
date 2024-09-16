package model.entity;

import model.enums.AdminPosition;

public class Admin extends Person {
    private String role;
    private String address;
    private AdminPosition position;

    public Admin(int id, String username, String password, String email, String phone, String role, String address,AdminPosition position) {
        super(id, username, password, email, phone);
        this.role = role;
        this.address = address;
        this.position = position;
    }

    public Admin(String role, String address) {
        this.role = role;
        this.address = address;
    }
    public Admin() {

    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public AdminPosition getPosition() {
        return position;
    }

    public void setPosition(AdminPosition position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Admin{" +super.toString()+
                "role='" + role + '\'' +
                ", address='" + address + '\'' +
                ", position=" + position +
                "} ";
    }
}
