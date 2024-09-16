package serviceImpl;

import FileUtil.FileWriteRead;
import model.entity.Admin;
import model.entity.Elan;
import model.entity.User;
import model.enums.AdminPosition;
import service.AdminService;
import service.CommonService;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class AdminServiceImpl implements CommonService<Admin>, AdminService {
    static List<Admin> adminList = new ArrayList<>();
    static {
        adminList.add(new Admin(1,"Merdan","ab12","merdan@gmail.com",
                "055555555","Admin1","Quba,Pusteqasim", AdminPosition.ADMIN));
        adminList.add(new Admin(2,"Elmin","cd34","elmin@gmail.com",
                "0704444444","Admin2","Quba,Rustov", AdminPosition.BAS_ADMIN));

    }

    @Override
    public List<User> getAllUsers() {
       UserServiceImpl userService = new UserServiceImpl();
       return userService.getAllList();
    }

    @Override
    public List<Admin> getAdresss(String adress) {
        return adminList.stream().filter(unvan->unvan.getAddress().equals(adress)).toList();
    }

    @Override
    public List<Admin> getAdRole(String role) {
        return adminList.stream().filter(rol->rol.getRole().equals(role)).toList();
    }

    @Override
    public void create(Admin object) {
        adminList.add(object);
        FileWriteRead.writeFile("textFileCreate",object.toString());
    }

    @Override
    public void update(int id, Admin object) {
        getById(id);
        delete(id);
        create(object);
    }

    @Override
    public void delete(int id) {
        Admin admin = adminList.remove(id);
        FileWriteRead.writeFile("textFileDelete",admin.toString());
    }

    @Override
    public List<Admin> getAllList() {
        return adminList;
    }

    @Override
    public void getById(int id) {
        try {
            getById(id);
    }catch (Exception e){
            new Exception("Admin Id tapilmadi");
        }

    }

}
