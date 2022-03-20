package ru.job4j.oop;

public class Max {
    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public int max(int a, int b, int c) {
        int temp = max(a, b);
        return max(temp, c);
    }
}
