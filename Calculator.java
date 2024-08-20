
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        addition();
        subtraction();
        multiplication();
        division();
        modulo();
    }public static void addition() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first : ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second: ");
        double num2 = scanner.nextDouble();
        double result = num1 + num2;
        System.out.println( + num1 + " + " + num2 + " = " + result);
        scanner.close();
    }public static void subtraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first : ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second: ");
        double num2 = scanner.nextDouble();
        double result = num1 - num2;
        System.out.println( + num1 + " - " + num2 + " = " + result);
        scanner.close();
    }public static void multiplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second : ");
        double num2 = scanner.nextDouble();
        double result = num1 * num2;
        System.out.println( + num1 + " * " + num2 + " = " + result);
        scanner.close();
    }public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first : ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second : ");
        double num2 = scanner.nextDouble();
        if (num2 == 0) {
            System.out.println("Cannot divide by zero.");
        } else {
            double result = num1 / num2;
            System.out.println( + num1 + " / " + num2 + " = " + result);
        }
        scanner.close();
    }public static void modulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first : ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second : ");
        double num2 = scanner.nextDouble();
        if (num2 == 0) {
            System.out.println("Cannot divide by zero.");
        } else {
            double result = num1 % num2;
            System.out.println( + num1 + " % " + num2 + " = " + result);
        }
        scanner.close();
    }
}
