package Projects.Car_Manufacturing_Managment_System;

import java.util.Scanner;

public class Main {
    public static void showMenu() {
        System.out.println(
                "=============== Car Managment System =================\n1.Add Car\n2.display all cars\n3.display specific car\n4.Update Car\n5.Delete car\n6.exit\nEnter the choice");
    }

    public static void main(String[] args) {
        CarDAOimp dao = new CarDAOimp();

        Scanner sc = new Scanner(System.in);
        while (true) {
            showMenu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("enter the car name");
                    String name = sc.nextLine();
                    System.out.println("enter the car model");
                    String model = sc.nextLine();
                    System.out.println("enter the car price");
                    double price = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("enter the car manufacturer");
                    String manu = sc.nextLine();
                    dao.addCar(new Car(name, model, price, manu));
                    break;
                case 2:
                    System.out.println(dao.getAllCars());
                    break;
                case 3:
                    System.out.println("enter the id of car");
                    int cid = sc.nextInt();
                    System.out.println(dao.getCarById(cid));
                    break;
                case 4:
                    System.out.println("enter the id of car");
                    int carid = sc.nextInt();
                    System.out.println("enter the car name");
                    String updatename = sc.nextLine();
                    System.out.println("enter the car model");
                    String updatemodel = sc.nextLine();
                    System.out.println("enter the car price");
                    double updateprice = sc.nextDouble();
                    System.out.println("enter the car manufacturer");
                    String updatemanu = sc.nextLine();
                    dao.updateCar(new Car(carid, updatename, updatemodel, updateprice, updatemanu));
                    break;
                case 5:
                    System.out.println("Enter the id of the car");
                    dao.deleteCar(sc.nextInt());
                    break;
                case 6:
                    System.out.println("====================BYE=====================");
                    sc.close();
                    return;
                default:
                    System.out.println("enter the proper input");
                    break;
            }

        }
    }
}

