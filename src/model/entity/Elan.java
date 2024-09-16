package model.entity;

public class Elan {
    private int id;
    private String marka;
    private String model;
    private String color;
    private int year;
    private String motor;
    private String city;

    public Elan(int id, String marka, String model, String color, int year, String motor, String city) {
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.color = color;
        this.year = year;
        this.motor = motor;
        this.city = city;
    }

    public Elan() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setAge(int age) {
        this.year = age;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Elan{" +
                "id=" + id +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", age=" + year +
                ", motor='" + motor + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
