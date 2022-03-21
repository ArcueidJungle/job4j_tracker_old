package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private boolean accuracy;

    public Surgeon(String name, String surname, String education, String birthday, boolean courtesy, boolean accuracy) {
        super(name, surname, education, birthday, courtesy);
        this.accuracy = accuracy;
    }
}

