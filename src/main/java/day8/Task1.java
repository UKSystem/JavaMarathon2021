//https://docs.google.com/document/d/1x8qaoA2wT-WH832xA97oef4pimto59jFbViNDiDKmOs/edit
//https://javatalks.ru/posts/133278

package day8;

public class Task1 {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        StringBuilder stringOfNumbers = new StringBuilder();

        for (int i = 0; i < 20001; i++) {
            stringOfNumbers.append(i).append(" ");
        }
        System.out.println(stringOfNumbers.toString());                                 // 15мс

/*
        String stringOfNumbersExperiment = "";
        for (int i = 0; i < 20001; i++) {
            stringOfNumbersExperiment = stringOfNumbersExperiment + i + " ";
        }
        System.out.println(stringOfNumbersExperiment);                                  // 344мс
*/

        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("программа выполнялась " + timeSpent + " миллисекунд");


    }
}
