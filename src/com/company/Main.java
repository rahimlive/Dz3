package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Rahim";
        names[1] = "Alexandr";
        names[2] = "Odil";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        for (int i = 1; i <= 3; i++) {

            switch (i) {
                case 1:
                    System.out.println("Доброе утро, Рахим");
                    break;
                case 2:
                    System.out.println("Добрый день, Александр");
                    break;
                case 3:
                    System.out.println("Добрый вечер, Одиль");
                    break;
                default:
                    System.out.println("Имени в списке нет))");

            }
        }
    }
}