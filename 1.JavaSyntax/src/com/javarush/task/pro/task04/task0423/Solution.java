package com.javarush.task.pro.task04.task0423;

import java.util.Scanner;

/* 
Калибровка климата
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //напишите тут ваш код
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            if(scanner.hasNextInt()) {
                int data = scanner.nextInt();
                sum = sum + data;
            }
        }
        sum = sum / 5;
        System.out.print(sum);
    }
}
