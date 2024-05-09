package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Calculation calculation1 = Calculation.getInstance("haha", "hihi");
        Calculation calculation2 = Calculation.getInstance("hoo", "haaa");
        System.out.println("calculation"+ calculation1.getDao()+ " "+ calculation1.getEnv());
        System.out.println("calculation"+ calculation2.getDao()+ " "+ calculation2.getEnv());
    }
}