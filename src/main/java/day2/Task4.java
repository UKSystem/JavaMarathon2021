package day2;

import java.util.Scanner;
import static java.lang.Math.*; //Математические функции и константы (класс Math)

public class Task4 {
    public static void main(String[] args) {

        Scanner newinput = new Scanner(System.in);
        System.out.print("Введите число x: ");
        double x = newinput.nextDouble();
        System.out.println();

        double y = 0;  // double y = 420;

        if (x >= 5)
        {
            y = (pow(x,2) - 10)/(x + 7);
        } else if (x > -3 && x < 5)
        {
            y = (x + 3) * (pow(x,2)-2);
        } else
        {
            y = 420;  // убрать !
        }

        System.out.println(y);
/*
Часто используемые математические функции
sqrt(a) — извлекает квадратный корень из числа а.
pow(a, n) —  a возводится в степень n.
sin(a), cos(a), tan(a) — тригонометрические функции sin, cos и tg угла a указанного в радианах.
 asin(n), acos(n), atan(n) — обратные тригонометрические функции, возвращают угол в радианах.
exp(a) — возвращает значение экспоненты, возведенной в степень a.
log(a) — возвращает значение натурального логарифма числа a.
log10(a) — возвращает значение десятичного логарифма числа a.
abs(a) — возвращает модуль числа a.
round(a) — округляет вещественное число до ближайшего целого.
Константы
PI — число «пи», с точностью в 15 десятичных знаков.
E — число «e»(основание экспоненциальной функции), с точностью в 15 десятичных знаков.
 */

    }
}
