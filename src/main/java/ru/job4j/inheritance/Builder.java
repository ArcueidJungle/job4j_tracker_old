package ru.job4j.inheritance;

public class Builder extends Engineer {
    private int quality;

    public Builder(String name, String surname, String education, String birthday, int expirience, int quality) {
        super(name, surname, education, birthday, expirience);
        this.quality = quality;
    }
}
