package day5;

public class Task1 {
    public static void main(String[] args) {

        Car car1 = new Car();

        car1.setManufactured(2020);
        car1.setColor("dark blue");
        car1.setModel("BMW X5");

        System.out.println("Транспортное средство " + car1.getModel() + ", " + car1.getManufactured() + " года выпуска, цвета " + car1.getColor() + ".");
    }
}