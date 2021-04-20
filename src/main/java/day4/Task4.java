package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        int[] arr = new int[100];               // Размер массива
        int sumQuantityElements = 3;            // Количество рядом стоящих элеметов для суммирования
        int index = 0;                          // Индекс первого элемента в элементах для суммирования
        int sumParser = 0;                      // Переменная для промежуточного суммирования
        int sumFinish = 0;                      // Переменная для хранения максимального результата

        Random random = new Random();

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = random.nextInt(10000);
        }

        for (int i = 0; i < arr.length - sumQuantityElements + 1; i++)
        {
            sumParser = 0;

            for (int j = 0; j < sumQuantityElements; j++){
                sumParser += arr[i+j];
            }

            if (sumFinish < sumParser)
            {
                sumFinish = sumParser;
                index = i;
            }
        }

        System.out.println(sumFinish);
        System.out.println(index);

    }
}
