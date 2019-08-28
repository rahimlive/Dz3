package com.company;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Rahim";
        names[1] = "Alexandr";
        names[2] = "Odil";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        String name = "Aibek";
        switch (name) {
            case "Rahim":
                System.out.println("Ваше Имя, Рахим");
                break;
            case "Alexandr":
                System.out.println("Ваше Имя, Александр");
                break;
            case "Odil":
                System.out.println("Ваше Имя, Одиль");
                break;
            default:
                System.out.println("Имени в списке нет))");
        }
        int j = 0;
        while (j < 1) {
            System.out.println("Привет, " + names[0]);
            System.out.println("Привет, " + names[1]);
            System.out.println("Привет, " + names[2]);
            j++;
        }
    }
}