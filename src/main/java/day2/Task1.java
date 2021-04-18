//https://docs.google.com/document/d/1YbQMrmZby8nNHthz3_qkwdTR2EJMg7KDiGo3yRCACCQ/edit
//http://study-java.ru/uroki-java/arifmeticheskie-operatory-i-matematika-v-java/
//import static java.lang.Math.*; //Математические функции и константы (класс Math)

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

package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner newinput = new Scanner(System.in);
        System.out.print("Введите количество этажей в здании: ");
        int allfloor = newinput.nextInt();
        System.out.println();
        if (allfloor>0 && allfloor<5){
            System.out.println("Малоэтажный дом");
        }else if (allfloor>4 && allfloor<9){
            System.out.println("Среднеэтажный дом");
        }else if (allfloor>8 && allfloor<151){
            System.out.println("Многоэтажный дом");
        }else System.out.println("Таких домов не бывает");
    }
}
