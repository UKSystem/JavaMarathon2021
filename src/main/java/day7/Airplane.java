package day7;

public class Airplane {

    private String producer;    // изготовитель
    private int year;           // год выпуска
    private double length;      // длина
    private int weight;         // вес
    private int fuel;           // количество топлива в баке

    public Airplane(String producer, int year, double length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public double getLength() {
        return length;
    }

    public void fillUp(int n) {
        this.fuel = this.fuel + n;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    public static void compareAirplanes(Airplane plane1, Airplane plane2) {
        if (plane1.length > plane2.length) System.out.println(plane1.producer + " длиннее.");
        else System.out.println(plane2.producer + " длиннее.");
    }
}
