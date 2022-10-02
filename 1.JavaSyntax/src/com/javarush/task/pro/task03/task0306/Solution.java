package com.javarush.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Треугольник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sideA = scan.nextInt();
        int sideB = scan.nextInt();
        int sideC = scan.nextInt();
        
        if ((sideA + sideB > sideC) && (sideB + sideC > sideA) && (sideC + sideA > sideB)) {
            System.out.print(TRIANGLE_EXISTS);
        } else {
            System.out.print(TRIANGLE_NOT_EXISTS);
        }
        //напишите тут ваш код
    }
}
