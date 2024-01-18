 import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Advanced Calculator!");
        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            if (choice == 5) {
                System.out.println("Goodbye!");
                break;
            }

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double result;
            switch (choice) {
                case 1:
                    result = Calculator.add(num1, num2);
                    break;
                case 2:
                    result = Calculator.subtract(num1, num2);
                    break;
                case 3:
                    result = Calculator.multiply(num1, num2);
                    break;
                case 4:
                    result = Calculator.divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid choice");
                    continue;
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}

 
 class Calculator {
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return num1 / num2;
    }
}

