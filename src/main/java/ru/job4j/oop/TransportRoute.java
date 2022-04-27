package ru.job4j.oop;

public class TransportRoute {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle airplane = new Airplane();
        Vehicle train = new Train();

        Vehicle[] vehicles = new Vehicle[]{bus, airplane, train};
        for (Vehicle a : vehicles) {
            a.move();
        }
    }
}
