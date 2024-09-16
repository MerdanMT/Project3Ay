import model.entity.Admin;
import model.entity.Person;
import model.enums.AdminPosition;
import model.enums.UserPosition;
import serviceImpl.AdminServiceImpl;
import serviceImpl.ElanServiceImpl;
import serviceImpl.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        AdminServiceImpl adminService = new AdminServiceImpl();
        UserServiceImpl userService = new UserServiceImpl();
        ElanServiceImpl elanService = new ElanServiceImpl();
        adminService.getByIdUser(1);

//        System.out.println();
//        System.out.println(userService.getAllList());
//        System.out.println();
//        System.out.println(elanService.getAllList());
//        System.out.println(adminService.getAllUsers());
    }
}