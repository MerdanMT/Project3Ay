package service;

import model.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUserByName(String username);
    List<User> phoneNumber(String number);
    List<User> email(String email);
    List<User> isYeri(String isYeri);
    List<User> dogumYeri(String yasayisYeri);

}
