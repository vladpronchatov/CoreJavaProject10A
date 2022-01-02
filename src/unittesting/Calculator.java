package unittesting;

public class Calculator {
    public int addition(int a, int b) {
        int total = a + b;
        return total;

    }

    public int subtraction(int a, int b) {
        int total = a - b;
        return total;

    }

    public int multiplication(int a, int b) {
        int total = a * b;
        return total;

    }
    public String getText(String firstName) {
        String fullName = firstName + " " + "clinton";
        return fullName;
    }
}
