package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static  int minus(int b) {
        return  b - x;
    }

    public int divide(int c) {
        return  c / x;
    }

    public int sumAllOperation(int d) {
        return divide(d) + minus(d) + sum(d) + multiply(d);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int rsl = calculator.sumAllOperation(3);
        System.out.println(rsl);
    }
}