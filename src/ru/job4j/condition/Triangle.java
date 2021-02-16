package ru.job4j.condition;

public class Triangle {
    //ab + ac > bc и ac + bc > ab и ab + bc > ac
    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }

    public static void main(String[] args) {
        boolean result = Triangle.exist(3.0, 1.0, 3.0);
        System.out.println(result);
    }
}
