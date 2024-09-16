package serviceImpl;

import model.entity.Elan;
import service.CommonService;
import service.ElanService;

import java.util.ArrayList;
import java.util.List;

public class ElanServiceImpl implements CommonService<Elan>, ElanService {
    static List<Elan> elans = new ArrayList<>();
    static {
        elans.add(new Elan(1,"BMW","F30","Black",2020,"3.5 turbo","Baki"));
        elans.add(new Elan(2,"Mercedes","E-Class","White",2023,"2.5 turbo","Sumqayit"));
        elans.add(new Elan(3,"Nissan","GT-R","Black",2021,"3.2 turbo","Quba"));
    }

    @Override
    public void create(Elan object) {
        elans.add(object);
    }

    @Override
    public void update(int id, Elan object) {
        delete(id);
        create(object);
    }

    @Override
    public void delete(int id) {
        elans.remove(id);
    }

    @Override
    public List<Elan> getAllList() {
        return elans;
    }

    @Override
    public void getById(int id) {
        elans.get(id);
    }

    @Override
    public List<Elan> getElanByMarka(String marka) {
       return elans.stream().filter(markaName->markaName.getMarka().equals(marka)).toList();

    }

    @Override
    public List<Elan> getElanByYear(int year) {
        return elans.stream().filter(il->il.getYear()==year).toList();

    }

    @Override
    public List<Elan> getElanCity(String city) {
        return elans.stream().filter(seher->seher.getCity().equals(city)).toList();
    }

    @Override
    public List<Elan> getModelcar(String model) {
        return elans.stream().filter(model1->model1.getModel().equals(model)).toList();
    }

    @Override
    public List<Elan> getModelcarByMarka(String marka) {
        return elans.stream().filter(marka1->marka1.getMarka().equals(marka)).toList();
    }
}
