package service;

import model.entity.Admin;
import model.entity.Person;
import model.entity.User;

import java.util.List;

public interface AdminService {
    List<User> getAllUsers();
    List<Admin> getAdresss(String adress);
    List<Admin> getAdRole(String role);
    void create(User object);
    void update(int id,User object);
    void deleteUser(int id);
    void getByIdUser(int id);


}
