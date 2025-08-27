package Projects.Car_Manufacturing_Managment_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CarDAOimp implements CarDAO {

    private static final String url = "jdbc:mysql://localhost:3306/cardb";
    private static final String username = "root";
    private static final String password = "root";

    private Connection getconnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    @Override
    public void addCar(Car car) {
        String sql = "INSERT INTO cars(name,model,price,manufacturer) VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = getconnection().prepareStatement(sql);
            ps.setString(1, car.getName());
            ps.setString(2, car.getModel());
            ps.setDouble(3, car.getPrice());
            ps.setString(4, car.getManufacturer());
            ps.executeUpdate();
            System.out.println("👌 car added sucessfully");
        } catch (SQLException e) {
            System.out.println("😥 not added car");
            System.out.println(e.getMessage());
        }

    }

    @Override
    public List<Car> getAllCars() {

        String sql = "SELECT * FROM cars";
        try {
            Statement st = getconnection().createStatement();
            ResultSet data = st.executeQuery(sql);
            List<Car> datCars = new ArrayList<>();
            while (data.next()) {
                Car car = new Car();
                car.setId(data.getInt("id"));
                car.setName(data.getString("name"));
                car.setPrice(data.getDouble("price"));
                car.setModel(data.getString("model"));
                car.setManufacturer(data.getString("manufacturer"));
                datCars.add(car);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return List.of();

    }

    @Override
    public void updateCar(Car car) {
        String sql = "UPDATE cars SET name=?,model=?,price=?,manufacturer=? where id=?";
        try {
            PreparedStatement ps = getconnection().prepareStatement(sql);
            ps.setString(1, car.getName());
            ps.setString(2, car.getModel());
            ps.setDouble(3, car.getPrice());
            ps.setString(4, car.getManufacturer());
            ps.setInt(5, car.getId());
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("👌 car updated sucessfully");
            } else {
                System.out.println("😥 not updated car");
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deleteCar(int id) {
        String sql = "DELETE FROM cars WHERE id=?";
        try {
            PreparedStatement ps = getconnection().prepareStatement(sql);
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("🗑️ Car deleted successfully");
            } else {
                System.out.println("❌ Car not found");
            }

        } catch (Exception e) {
            System.out.println("❌ Failed to delete car");
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Car getCarById(int id) {
        String sql = "SELECT * FROM cars WHERE id=?";

        try {
            Statement st = getconnection().createStatement();
            ResultSet data = st.executeQuery(sql);
            List<Car> datCars = new ArrayList<>();
            while (data.next()) {
                Car car = new Car();
                car.setId(data.getInt("id"));
                car.setName(data.getString("name"));
                car.setPrice(data.getDouble("price"));
                car.setModel(data.getString("model"));
                car.setManufacturer(data.getString("manufacturer"));
                datCars.add(car);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (Car) List.of();

    }

}
