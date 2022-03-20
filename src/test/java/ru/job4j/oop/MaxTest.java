package ru.job4j.oop;
import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void when1and2and3then3() {
        int a = 1;
        int b = 2;
        int c = 3;
        int expected = 3;
        Max three = new Max();
        int rsl = three.max(a, b, c);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void when13and2and14then14() {
        int a = 13;
        int b = 2;
        int c = 14;
        int expected = 14;
        Max three = new Max();
        int rsl = three.max(a, b, c);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void when10and2and5then10() {
        int a = 10;
        int b = 2;
        int c = 5;
        int expected = 10;
        Max three = new Max();
        int rsl = three.max(a, b, c);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void when13and16and14then16() {
        int a = 13;
        int b = 16;
        int c = 14;
        int expected = 16;
        Max three = new Max();
        int rsl = three.max(a, b, c);
        Assert.assertEquals(expected, rsl);
    }
}
