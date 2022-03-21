package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private String teeth;

    public Dentist(String name, String surname, String education, String birthday, boolean courtesy, String teeth) {
        super(name, surname, education, birthday, courtesy);
        this.teeth = teeth;
    }
}
