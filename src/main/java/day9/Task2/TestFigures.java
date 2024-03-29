package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {

        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };

        System.out.println("Сумма периметров красных фигур: " + calculateRedPerimeter(figures));
        System.out.println("Сумма площадей красных фигур: " + calculateRedArea(figures));
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double sumPerimeter = 0;
        for (Figure i : figures) {
            if (i.getColor().equals("Red")) {
                sumPerimeter += i.perimeter();
            }
        }
        return sumPerimeter;
    }

    public static double calculateRedArea(Figure[] figures) {
        double sumArea = 0;
        for (Figure i : figures) {
            if (i.getColor().equals("Red")) {
                sumArea += i.area();
            }
        }
        return sumArea;
    }

}
