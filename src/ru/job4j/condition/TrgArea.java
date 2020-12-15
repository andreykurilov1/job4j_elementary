package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double rsl = a + b + c;
        double p = rsl / 2;
        double rsl1 = p - a;
        double rsl2 = p - b;
        double rsl3 = p - c;
        double rsl4 = p * rsl1;
        double rsl5 = rsl4 * rsl2 * rsl3;
        double s = Math.sqrt(rsl5);
        return s;
    }

    public static void main(String[] args) {

        double s = TrgArea.area(5, 5, 8);
        System.out.println("Площадь треугольника = " + s);
    }
}
