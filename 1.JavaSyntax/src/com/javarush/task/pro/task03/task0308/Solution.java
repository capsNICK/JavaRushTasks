package com.javarush.task.pro.task03.task0308;

import java.util.Scanner;

/* 
Координатные четверти
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        boolean one = ((x>0) && (y>0));
        boolean two = ((x<0) && (y>0));
        boolean three = ((x<0) && (y<0));
        boolean four = ((x>0) && (y<0));
        
        if (one){
            System.out.print(1);
        } else if (two){
            System.out.print(2);
        } else if (three){
            System.out.print(3);
        } else {
            System.out.print(4);
        }
        //напишите тут ваш код
    }
}
