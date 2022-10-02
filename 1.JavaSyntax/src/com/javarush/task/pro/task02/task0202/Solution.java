package com.javarush.task.pro.task02.task0202;

/* 
Полнометражная картина
*/

public class Solution {

    public static void main(String[] args) {
        // объявляем переменную centimeters типа int и сразу же в строке
        // объявления присваиваем ей значение 243
        int centimeters = 243;

        // объявляем переменную meters типа int и присваиваем ей значение -
        // результат вычисления выражения centimeters / 100
        int meters = centimeters / 100;

        // выводим на экран значение переменной meters
        System.out.println(meters);
    }
}
