package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double x = x2 - x1;
        double y = y2 - y1;
        double powX = Math.pow(x, 2);
        double powY = Math.pow(y, 2);
        double sumXY = powX + powY;
        double d = Math.sqrt(sumXY);
        return d;
    }

    public static void main(String[] args) {
        double d = Point.distance(3, 4, 5, 6);
        System.out.println(d);
    }
}