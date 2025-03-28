import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Simple Calculator Application!");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("Choose an operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter choice (1-4): ");
        int choice = scanner.nextInt();
        
        double result = 0;
        boolean validChoice = true;
        
        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validChoice = false;
                }
                break;
            default:
                System.out.println("Invalid choice! Please select a valid operation.");
                validChoice = false;
        }
        
        if (validChoice) {
            System.out.println("Result: " + result);
        }
        
        System.out.println("Thank you for using the Simple Calculator Application!");
        scanner.close();
    }
}
