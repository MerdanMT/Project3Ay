package service;

import model.entity.Admin;
import model.entity.User;

import java.util.List;

public interface AdminService {
    List<User> getAllUsers();
    List<Admin> getAdresss(String adress);
    List<Admin> getAdRole(String role);


}
