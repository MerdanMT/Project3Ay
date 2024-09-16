package service;

import model.entity.Admin;
import model.entity.User;

import java.util.List;

public interface CommonService<T> {
     void create(T object);
     void update(int id,T object);
     void delete(int id);
     List<T> getAllList();
     void getById(int id);
}
