/*
https://docs.google.com/document/d/1cOKNVIuLFHV0GHSMhv8vfc9ic0Rv8I3qOsiILKkdH9c/edit
В классе Самолет реализовать статический метод compareAirplanes,
который в качестве аргументов принимает два объекта класса Airplane (два самолета)
и выводит сообщение в консоль о том, какой из самолетов длиннее.
 */
package day7;

public class Task1 {
    public static void main(String[] args) {

        Airplane plane1 = new Airplane("Boeing 737–800", 2000, 35.5, 79015);
        Airplane plane2 = new Airplane("Boeing 737", 1995, 29.4, 79000);

        Airplane.compareAirplanes(plane1, plane2);

    }
}