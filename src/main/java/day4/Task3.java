package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        int[][] arr = new int[12][8];
        int sumParser = 0;
        int sumFinish = 0;
        int index = 0;

        Random random = new Random();

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                arr[i][j] = random.nextInt(50);
                System.out.print(arr[i][j] + " ");
                sumParser += arr[i][j];
            }
            if (sumFinish < sumParser) {
                sumFinish = sumParser; index = i; sumParser = 0;
            } else sumParser = 0;
            System.out.println();
        }

        System.out.println(sumFinish + " " + index);

        //        System.out.println(Arrays.deepToString(arr));

    }
}
