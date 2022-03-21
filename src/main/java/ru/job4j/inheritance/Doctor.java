package ru.job4j.inheritance;

public class Doctor extends Profession {

    private boolean courtesy;

    public Doctor(String name, String surname, String education, String birthday, boolean courtesy) {
        super(name, surname, education, birthday);
        this.courtesy = courtesy;
    }
}
