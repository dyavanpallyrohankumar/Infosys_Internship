package Projects.Car_Manufacturing_Managment_System;

public class Car {
    private int id;
    private String name;
    private String model;
    private double price;
    private String manufacturer;

    public Car(String name, String model, double price, String manufacturer) {

        this.name = name;
        this.model = model;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public Car(int id, String name, String model, double price, String manufacturer) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public Car() {
        // TODO Auto-generated constructor stub
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Car [id=" + id + ", name=" + name + ", model=" + model + ", price=" + price + ", manufacturer="
                + manufacturer + "]";
    }

}