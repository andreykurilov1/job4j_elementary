package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(700);
        int dollar = Converter.rubleToDollar(580);
        System.out.println(euro + " euro.");
        System.out.println(dollar + " dollar.");
    }
}