//https://docs.google.com/document/d/1hxYQdLfOdmU0Sjm-EyAx5ZvXNPFPMBJZAwkxzVmg_Yk/edit
//https://metanit.com/java/tutorial/3.14.php

package day6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Car car1 = new Car(2014, "black", "BMW X6 M");
        Motorbike bike1 = new Motorbike(2000,"blue", "BMW S 1000 XR");

        Scanner newInput = new Scanner(System.in);
        System.out.println("Введите год:");
        int inputYear = newInput.nextInt();

        System.out.println("Разница между годом выпуска Автомобиля и введенным годом: " + car1.yearDifference(inputYear));
        System.out.println("Разница между годом выпуска Мотоцикла и введенным годом: " + bike1.yearDifference(inputYear));
    }
}