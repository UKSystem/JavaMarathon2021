package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner newinput = new Scanner(System.in);
        System.out.print("Введите два числа через пробел: ");
        int a = newinput.nextInt();
        int b = newinput.nextInt();

        if (a<b){
            for (int i=a+1; i > a && i < b; i++)
            {
                if (i % 5 == 0 && i % 10 > 0)
                {
                    System.out.print(i + " ");
                }
            }
        } else System.out.println("некорректный ввод");



    }
}
