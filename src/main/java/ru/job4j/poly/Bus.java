package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void rideVoid() {
        System.out.println(" Транспорт выезжает");
    }

    @Override
    public void
    passengers(int ride) {
        System.out.println(" Число пассажиров:" + ride);
    }

    @Override
    public double price(double fuel) {
        double price = 40;
        return  price * fuel;
    }
}
