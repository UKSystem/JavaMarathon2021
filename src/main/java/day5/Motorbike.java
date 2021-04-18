package day5;

public class Motorbike {

    private int manufactured;
    private String color;
    private String model;

    public Motorbike (int manufactured, String color, String model){
        this.manufactured = manufactured;
        this.color = color;
        this.model = model;
    }

    public int getManufactured() {
        return manufactured;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
