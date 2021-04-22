package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {

        double sumPerimeter = 0;
        double sumArea = 0;

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

        for (Figure i : figures) {

            if (i.getColor() == "Red") {
                sumPerimeter += i.perimeter();
                sumArea += i.area();
            }
        }

        System.out.println("Сумма периметров красных фигур: " + sumPerimeter);
        System.out.println("Сумма площадей красных фигур: " + sumArea);
    }
}
