package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            array[i] = console.nextInt(); //test_1
        }
        
    }
}
