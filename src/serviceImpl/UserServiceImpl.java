package serviceImpl;

import model.entity.User;
import model.enums.UserPosition;
import service.CommonService;
import service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements CommonService<User>, UserService {
    static List<User> users = new ArrayList<>();
    static {
        users.add(new User(1,"Adil","ef12","adil@gamil.com",
                "0513333333",26,"BonaDea Hospital","Celilabad", UserPosition.BIR_ILLIK_ABUNE));
        users.add(new User(2,"Elsen","xz56","elsen@gamil.com",
                "0102222222",25,"Saglam Aile Hospital","Xacmaz", UserPosition.IKI_ILLIK_ABUNE));
    }

    @Override
    public void create(User object) {
        users.add(object);
    }

    @Override
    public void update(int id, User object) {
        delete(id);
        create(object);
    }

    @Override
    public void delete(int id) {
        users.remove(id);
    }

    @Override
    public List<User> getAllList() {
        return users;
    }

    @Override
    public void getById(int id) {
        System.out.println(users.get(id-1));
    }

    @Override
    public List<User> getUserByName(String username) {
        return users.stream().filter(name->name.getUsername().equals(username)).toList();

    }

    @Override
    public List<User> phoneNumber(String prefiks) {
        List<User> users1 = new ArrayList<>();
        if (prefiks == "050" || prefiks == "070" || prefiks == "077" || prefiks == "055" || prefiks == "010" || prefiks == "051")
        {
            users1 = users.stream().filter(nomre -> nomre.getPhone().startsWith(prefiks)).toList();

        }
        else if (prefiks == "+99450" || prefiks == "+99470" || prefiks == "+99477" || prefiks == "+99455" || prefiks == "+99410" || prefiks == "+99451")
        {
            users1 = users.stream().filter(nomre -> nomre.getPhone().startsWith(prefiks)).toList();

        }
        return users1.stream().toList();
    }

    @Override
    public List<User> email(String email) {
        return users.stream().filter(email1 -> email1.getEmail().equals(email)).toList();
    }

    @Override
    public List<User> isYeri(String isYeri) {
        return users.stream().filter(isYeri1 -> isYeri1.getIsYeri().equals(isYeri)).toList();
    }

    @Override
    public List<User> dogumYeri(String yasayisYeri) {
        return users.stream().filter(yasayisYeri1 -> yasayisYeri1.getDogumYeri().equals(yasayisYeri)).toList();
    }
}
