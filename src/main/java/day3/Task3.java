package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner newInput = new Scanner(System.in);
        double a, b;
        int count = 1;

        while(count < 6)
        {
            System.out.print("Введите 2 числа через пробел: ");
            a = newInput.nextDouble();
            b = newInput.nextDouble();
            if (b == 0)
            {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(a / b);
            count++;
        }
    }
}
