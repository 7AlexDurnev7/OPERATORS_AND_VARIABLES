package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1 ввод данных
        Scanner in = new Scanner(System.in);
        System.out.println( "Введите сумму вклада");
        // 2 объявляем переменную с депозитом
        double deposit = in.nextDouble();
        System.out.println( "Введите процент по вкладу");
        // 3 объявляем переменную процентов
        double percent = in.nextDouble();
        in.close();
        // 4 считаем проценты за 1 год
       double firstYear = deposit * (1 + (percent / 100));
       // 5 считаем проценты за два года
       double secondYear = firstYear * ( 1 + (percent / 100));
       // 6 ввыводим данные
        System.out.println( "Сумма по вкладу с учетом процента за первый год составляет: "
                + firstYear + "рублей. " +
                "\nСумма с учетом процентов начисленных за два года составит: " + secondYear);
    }
}
