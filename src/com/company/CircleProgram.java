package com.company;

import java.util.Scanner;

public class CircleProgram {
    public static void main(String[] args) {
        // 1 ввод данных
        Scanner in = new Scanner(System.in);
        // 2 создаем константу для радиуса
        final double radius;
        System.out.println( "Введите радиус окружности");
        radius = in.nextDouble();
        in.close();
        // 3 создаем переменные для вычисления площади и длины окружности
        double square, length;
        // 4 прописываем формулу расчета площади  окружности
        square = Math.PI * (radius * radius);
        // 5 прописываем формулу расчета длины окружности
        length = Math.PI * 2 * radius;
        // 6 ввыводим данные
        System.out.println( "Площадь окружности составляет: " + square
                + "\nДлина окружности составляет: " + length);
    }
}
