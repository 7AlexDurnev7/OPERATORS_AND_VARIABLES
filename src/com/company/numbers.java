package com.company;

import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        // 1 ввод данных
        Scanner in = new Scanner(System.in);
        // 2 объявляем переменную
        int n;
        // 3 запрашиваем трехзначное число
        System.out.println( "Введите трехзначное число");
        n = in.nextInt();
        // 4 создаем переменные и считаем сумму введеных чисел
        int units = n % 10;
        int dozens = (n / 10) % 10;
        int hundreds = (n / 100) % 10;
        in.close();
        // 5 ввыводим данные
        System.out.println( "Сумма введеных цифр: " + (units + dozens + hundreds));
    }
}
