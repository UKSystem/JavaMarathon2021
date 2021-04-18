// https://docs.google.com/document/d/1EJYD0NNgOB1ODSLRaU80QT4Ds5wEndlBlbYcXnAiWf0/edit
// https://metanit.com/java/tutorial/7.2.php

package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner newInput = new Scanner(System.in);
        String city;

        do {
            System.out.print("Введите город: ");
            city = newInput.nextLine();

            switch (city) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    break;
                case "Стоп":
                    System.out.println("Осуществляем выход");
                    break;
                default:
                    System.out.println("Неизвестная страна");
                    break;
            }
        } while (!city.equals("Стоп"));


    }
}
