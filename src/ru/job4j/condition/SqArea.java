package ru.job4j.condition;

public class SqArea {
    public static double square (int p, int k) {
        //h = p / (2 * (k + 1));
        double rsl1 = k + 1;
        double rsl2 = 2 * rsl1;
        double h = p / rsl2;
        //L = h * k;
        double L = h * k;
        //s = L * h;
        double s = L * h;
        return s;
    }
    public static void main (String [] args) {
        double s = SqArea.square(6,2);
        System.out.println("площадь = " + s);
    }
}
