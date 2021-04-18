package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner newinput = new Scanner(System.in);
        System.out.print("Введите два числа через пробел: ");
        int a = newinput.nextInt();
        int b = newinput.nextInt();
        int i = a + 1;

        if (a<b){

            do
            {
                if (i % 5 == 0 && i % 10 > 0)
                {
                    System.out.print(i + " ");
                }
                i++;

            } while (i > a && i < b);

        } else System.out.println("некорректный ввод");

    }
}
