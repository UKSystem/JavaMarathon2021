package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int n = 10000;
        int[] arr = new int[100];
        int sumZero = 0;
        int numberZero = 0;
        int maxArr = 0;
        int minArr = n;

        Random random = new Random();

        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(n);
        }

        for(int j:arr)
        {
            System.out.println(j);

            if (j % 10 == 0)
            {
                sumZero += j;
                numberZero++;
           }
            if (maxArr < j) maxArr = j;
            if (minArr > j) minArr = j;
        }

        System.out.println("Наибольший элемент массива: " + maxArr);
        System.out.println("Наименьший элемент массива: " + minArr);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + numberZero);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sumZero);

    }
}
