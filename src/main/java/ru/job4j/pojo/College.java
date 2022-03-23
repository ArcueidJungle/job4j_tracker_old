package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setDate("01.05.2021");
        student.setFio("Ivanov Ivan Ivanovich");
        student.setGroup(40118);
        System.out.println(student.getFio() + " " + student.getDate() + " " + student.getGroup());
    }
}
