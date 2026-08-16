import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int divisor = 2; divisor * divisor <= number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] testValues = {-5, 0, 1, 2, 3, 4, 17, 25, 97};

        System.out.println("Testing fixed values:");
        for (int value : testValues) {
            if (isPrime(value)) {
                System.out.println(value + " is prime");
            } else {
                System.out.println(value + " is NOT prime");
            }
        }

        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter an integer to check: ");
        int number = input.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " is NOT prime");
        }

        input.close();
    }
}