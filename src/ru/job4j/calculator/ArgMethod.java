package ru.job4j.calculator;

public class ArgMethod {

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + age);
    }

    public static void main(String[] args) {
        String name = "Andrey Kurilov";
        int age = 26;

        ArgMethod.hello(name);

        ArgMethod.hello(name, age);

        ArgMethod.hello(age);

        ArgMethod.hello(name, name, name);
    }
}