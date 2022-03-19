package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
    }

    public static void main(String[] args) {
        Error errorU = new Error(true, 2, "Авария");
        errorU.printInfo();
        Error errorI = new Error(false, 0, "Ошибок нет");
        errorI.printInfo();
        Error error0 = new Error();
        error0.printInfo();

    }
}
