package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        int num = 0;
        boolean isExit = false;
        
        while (!isExit) {
            if (console.hasNextInt()) {
                int sum = console.nextInt();
                num += sum;
            } else if (console.hasNextLine()) {
                String line = console.nextLine();
                if (line.equalsIgnoreCase("enter")) {
                    isExit = true;
                }
            }
        }
        System.out.print(num); //напишите тут ваш код
    }
}