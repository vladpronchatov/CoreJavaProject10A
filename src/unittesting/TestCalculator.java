package unittesting;

import org.testng.Assert;

import java.util.Scanner;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int actualAdditionResult = calculator.addition(100, 80);
        int expectedAdditionResult = 180;
        Assert.assertEquals(actualAdditionResult, expectedAdditionResult);

        int actualSubtractionResult = calculator.subtraction(100, 80);
        int expectedSubtractionResult = 20;
        Assert.assertEquals(actualSubtractionResult, expectedSubtractionResult);

        int actualMultiplicationResult = calculator.multiplication(100, 80);
        int expectedMultiplicationResult = 8000;
        Assert.assertEquals(actualMultiplicationResult, expectedMultiplicationResult);

        System.out.println("Please enter your first name, will provide the last name");
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        String actualFullName = calculator.getText(firstName);
        String expectedFullName = firstName + " " + "clinton";
        System.out.println("your name is : " + actualFullName);
        Assert.assertEquals(actualFullName, expectedFullName);
    }
}
