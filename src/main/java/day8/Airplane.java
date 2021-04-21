package day8;

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

    public String toString() {
        return "Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }
}
