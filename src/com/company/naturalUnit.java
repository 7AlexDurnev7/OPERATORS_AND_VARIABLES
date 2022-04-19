package com.company;

import java.util.Scanner;

public class naturalUnit {

    public static void main(String[] args) {
        // 1 ввод данных
        Scanner in = new Scanner(System.in);
        // 2 объявляем переменные
        int x, y;
        // 3 запрашиваем у пользователя первое число
        System.out.println( "Введите первое целое число");
        x = in.nextInt();
        // 4 запрашиваем у пользователя второе число
        System.out.println( "Введите второе целое число");
        y = in.nextInt();
        in.close();
        // 5 создаем переменные и прописываем решение
        int totalUnit = x / y;
        int remains = x % y;
        int root = (int) Math.sqrt(x);
        // 6 ввыводим данные
        System.out.println("Результат деления целочисленного числа равен: " + totalUnit);
        System.out.println(" Результат остатка от деления целочисленного числа равен:" + remains);
        System.out.println(" Квадратный корень целочисленного числа равен:" + root);
    }
}
