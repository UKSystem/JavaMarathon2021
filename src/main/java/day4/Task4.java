package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        int[] arr = new int[100];
        int index = 0;
        int sumParser = 0;
        int sumFinish = 0;

        Random random = new Random();

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = random.nextInt(10000);
        }

        for (int i = 0; i < arr.length - 2; i++)
        {
            sumParser = 0;
            sumParser = arr[i] + arr[i+1] + arr [i+2];
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
