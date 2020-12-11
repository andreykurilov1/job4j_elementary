package ru.job4j.calculator;

public class Fit {
    //Идеальный вес для мужчин = (рост в сантиметрах – 100) · 1,15.
    //Идеальный вес для женщин = (рост в сантиметрах – 110) · 1,15.

    public static double manWeight(short heightM) {
        double rsl = (heightM - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short heightW) {
        double rsl = (heightW - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short heightM = 178;
        short heightW= 165;
        double man = Fit.manWeight(heightM);
        double woman = Fit.womanWeight(heightW);
        System.out.println("Идеальный вес для мужчин с ростом "+ heightM + " - " + man + "кг.");
        System.out.println("Идеальный вес для женщин с ростом "+ heightW + " - " + woman + "кг.");
    }

}