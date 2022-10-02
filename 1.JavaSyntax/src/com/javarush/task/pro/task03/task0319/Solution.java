package com.javarush.task.pro.task03.task0319;

public class Solution {

    public static void main(String[] args) {
        // объявляем переменные типа int
        int temperatureLow, temperatureMiddle, temperatureHigh, time;
        // присваиваем переменным значения
        temperatureLow = 100;
        temperatureMiddle = 400;
        temperatureHigh = 1000;
        time = 50;
        // объявляем переменную result типа String и присваиваем ей значение -
        // результат работы двух тернарных операторов
        // условие1 ? если да : иначе условие2 ? если да : иначе
        String result = time > 40 ? "Мясо сгорело" : time < 35 ? "Мясо готовится" : "Мясо готово";

        System.out.println(result);
    }
}
