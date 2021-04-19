package day6;

public class Car {
    private int manufactured;
    private String color;
    private String model;

    public Car (int manufactured, String color, String model){
        this.manufactured = manufactured;
        this.color = color;
        this.model = model;
    }

/*
    public void setManufactured(int manufactured) {
        this.manufactured = manufactured;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setModel(String model) {
        this.model = model;
    }

 */

    public int getManufactured() {
        return manufactured;
    }
    public String getColor() {
        return color;
    }
    public String getModel() {
        return model;
    }

    void info(){
        System.out.println("Это автомобиль");
    }

    int yearDifference(int inputYear){
        int yearDiff = inputYear - manufactured;
        if (yearDiff >= 0) return yearDiff;
        else return 0;
    }

}
