import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double principal = input.nextDouble();

        System.out.print("Enter annual interest rate: ");
        double rate = input.nextDouble();

        System.out.print("Enter time in years: ");
        double time = input.nextDouble();

        double simpleInterest = principal * rate * time / 100;
        double finalAmount = principal + simpleInterest;

        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Final Amount: " + finalAmount);
    }
}
