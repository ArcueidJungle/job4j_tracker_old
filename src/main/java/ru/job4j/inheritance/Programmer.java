package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String level;

    public Programmer(String name, String surname, String education, String birthday, int expirience, String level) {
        super(name, surname, education, birthday, expirience);
        this.level = level;
    }
}
