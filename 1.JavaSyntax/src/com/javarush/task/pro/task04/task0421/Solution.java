package com.javarush.task.pro.task04.task0421;

/* 
Охлаждение ядра планеты
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int i = 0;
        int sum = 0;
        while (i < 100) {
            i++;
            if (i % 2 == 0) 
                sum += i;
        }
        System.out.print(sum);
    }
}