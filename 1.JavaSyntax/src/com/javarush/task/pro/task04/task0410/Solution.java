package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        
        while (console.hasNextInt()) {
            int x = console.nextInt();
            
            if (x < min1) {
                min2 = min1;
                min1 = x;
            } else if (x > min1 && x < min2) {
                min2 = x;
            }
        } 
        System.out.print(min2);
    }
}