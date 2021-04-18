//https://docs.google.com/document/d/1Bhhj1UvOKQe-4ciTE069jFmh96z7MVDMMyyMKujHgGM/edit
//http://java-online.ru/java-random.xhtml
//http://developer.alexanderklimov.ru/android/java/array.php#multi
//http://java-online.ru/java-random.xhtml
package day4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        Scanner newInput = new Scanner(System.in);
        System.out.print("Ведите число: ");
        int n = newInput.nextInt();
        int[] arr = new int[n];
        int rnd;
        int sum = 0;
        int moreThanEight = 0;
        int equalOne = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;

        Random random = new Random();

        for (int i = 0; i < n; i++)
        {
            arr[i] = random.nextInt(10);
        }

        for (int j:arr)
        {
            System.out.print(j + " ");
            sum += j;
            if (j > 8) moreThanEight++;
            if (j == 1) equalOne++;
            if (j % 2 == 0) evenNumbers++; else oddNumbers++;
        }

        System.out.println();
        System.out.println("Длина массива: " + arr.length);
        System.out.println("Количестве чисел больше 8: " + moreThanEight);
        System.out.println("Количестве чисел равных 1: " + equalOne);
        System.out.println("Количестве четных чисел: " + evenNumbers);
        System.out.println("Количестве нечетных чисел: " + oddNumbers);
        System.out.println("Сумма всех чисел: " + sum);

    }
}
