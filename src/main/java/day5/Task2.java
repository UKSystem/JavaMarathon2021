package day5;


public class Task2 {
    public static void main(String[] args) {

        Motorbike bike1 = new Motorbike(2018, "black", "BMW S 1000 XR");

        System.out.println("Транспортное средство " + bike1.getModel() + ", " + bike1.getManufactured() + " года выпуска, цвета " + bike1.getColor() + ".");

    }
}
