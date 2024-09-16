package service;

import model.entity.Elan;

import java.util.List;

public interface ElanService {
    List<Elan> getElanByMarka(String marka);
    List<Elan> getElanByYear(int year);
    List<Elan> getElanCity(String city);
    List<Elan> getModelcar(String model);
    List<Elan> getModelcarByMarka(String marka);

}
