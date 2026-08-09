package _05_Collections._01_Lists;


import java.util.ArrayList;
import java.util.List;

class Car {
    String brand;

    Car(String brand) {
        this.brand = brand;
    }
}

    public class ListDemo {
        public static void main(String[] args) {
            List<String> users = new ArrayList<>();
            users.add("Ashutosh");
            users.add("Rahul");
            users.add("Shubham");
            System.out.println("All  Users");
            for (String user : users) {
                System.out.println(user);
            }

            Car car1 = new Car(" City Honda");
            Car car2 = new Car(" Mahindra");

            List<Car> carList = new ArrayList<>();
            carList.add(car1);
            carList.add(car2);
            for (Car car : carList){
                System.out.println(car.brand);
            }



        }
    }


