package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book iron = new Book("iron", 10);
        Book history = new Book("history", 5);
        Book physcho = new Book("psycho", 2);
        Book cleanCode = new Book("Clean code", 1);
        Book[] lib = new Book[4];
        lib[0] = iron;
        lib[1] = history;
        lib[2] = physcho;
        lib[3] = cleanCode;
        for (Book bk : lib) {
            System.out.println(bk.getName() + '-' + bk.getCount());
        }
        Book temp = lib[0];
        lib[0] = lib[3];
        lib[3] = temp;
        for (Book bk : lib) {
            System.out.println(bk.getName() + '-' + bk.getCount());
        }
        for (Book bk : lib) {
            if ("Clean code".equals(bk.getName())) {
                System.out.println(bk.getName() + '-' + bk.getCount());
            }
        }
     }
}
