package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показываем, что получаем
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String words;
        
        while (true) {
            words = console.nextLine();
            if (words.equals("enough")) {
                break;
            } else {
            System.out.println(words);
            }
        }//напишите тут ваш код
    }
}