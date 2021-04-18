package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner newInput = new Scanner(System.in);
        double a, b;


        while(true)
        {
            System.out.print("Введите 2 числа через пробел: ");
            a = newInput.nextDouble();
            b = newInput.nextDouble();
            if (b == 0) break;
            System.out.println(a / b);
        }
    }
}
