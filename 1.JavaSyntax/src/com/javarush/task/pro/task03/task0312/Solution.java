package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Сравним строки
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name1 = console.nextLine();
        String name2 = console.nextLine();
        if (name1.equals(name2)) {//напишите тут ваш код
            System.out.println("строки одинаковые");
        } else {//напишите тут ваш код
            System.out.println("строки разные");
        }
    }
}
