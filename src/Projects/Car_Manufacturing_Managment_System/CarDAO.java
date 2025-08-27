package Projects.Car_Manufacturing_Managment_System;

import java.util.List;

public interface CarDAO {
    void addCar(Car car);

    void updateCar(Car car);

    void deleteCar(int id);

    List<Car> getAllCars();

    Car getCarById(int id);

}
