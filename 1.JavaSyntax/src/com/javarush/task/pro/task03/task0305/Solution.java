package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        if (a == b) {
            if (b == c) {
                System.out.print (a + " " + b + " " + c);
            } else {
                System.out.print (a + " " + b);
            } 
        } else if (a == c) {
            System.out.print (a + " " + c);
        } else if (b == c) {
            System.out.print (b + " " + c);
        } else {
            System.out.print("");
        }
        //напишите тут ваш код
    }
}
