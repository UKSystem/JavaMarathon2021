package day6;

public class Task2 {
    public static void main(String[] args) {

        Airplane plane1 = new Airplane("Boeing 737–800", 1999, 29.5, 79015);

        plane1.setYear(2004);
        plane1.setLength(39.5);

        plane1.fillUp(10000);
        plane1.fillUp(16035);

        plane1.info();

    }
}