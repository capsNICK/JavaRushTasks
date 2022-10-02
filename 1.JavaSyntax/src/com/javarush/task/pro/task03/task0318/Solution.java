package com.javarush.task.pro.task03.task0318;

import java.util.Scanner;

/* 
Био-мясо
*/

public class Solution {
    public static String NOT_YET = "Искусственное мясо еще не готово.";
    public static String DONE = "Искусственное мясо готово.";
    public static String HORRIBLY_DONE = "Искусственное мясо превратилось в мясного монстра!";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours = scan.nextInt();
        int minute = scan.nextInt();
        
        if (hours == 0 && minute == 30) {
            System.out.print (DONE);
        } else if (hours == 0 && minute < 30) {
            System.out.print (NOT_YET);
        } else {
            System.out.print (HORRIBLY_DONE);
        }
        //напишите тут ваш код
    }
}
