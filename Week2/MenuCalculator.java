import java.util.Scanner;

public class MenuCalculator {

    // void method - just prints the menu
    public static void printMenu() {
        System.out.println();
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("0. Exit");
    }

    public static double calculate(int choice, double num1, double num2) {
        double result = 0;

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
                result = num1 / num2;
                break;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice == 0) {
                System.out.println("Your have been Exited!");
            }
            else if (choice < 0 || choice > 4) {
                System.out.println("Invalid choice, try again.");
            }
            else {
                System.out.print("Enter first number: ");
                double num1 = input.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = input.nextDouble();

                if (choice == 4 && num2 == 0) {
                    System.out.println("ERROR: Cannot divide by zero.");
                }
                else {
                    double result = calculate(choice, num1, num2);
                    System.out.println("Result: " + result);
                }
            }

        } while (choice != 0);

        input.close();
    }
}
