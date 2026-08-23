import java.util.Scanner;

public class BitMaskUtility{

    static boolean isBitSet(int number, int position) {
        int mask = 1 << position;
        return (number & mask) != 0;
    }

    static int setBit(int number, int position) {
        int mask = 1 << position;
        return number | mask;
    }

    static int clearBit(int number, int position) {
        int mask = 1 << position;
        return number & ~mask;
    }

    static int toggleBit(int number, int position) {
        int mask = 1 << position;
        return number ^ mask;
    }

    static String toBinary32(int number) {
        String binary = "";

        for (int i = 31; i >= 0; i--) {
            if ((number & (1 << i)) != 0)
                binary += "1";
            else
                binary += "0";
        }

        return binary;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.print("Enter position (0-31): ");
        int position = sc.nextInt();

        if (position < 0 || position > 31) {
            System.out.println("Invalid position");
            return;
        }

        System.out.println("1. Check bit");
        System.out.println("2. Set bit");
        System.out.println("3. Clear bit");
        System.out.println("4. Toggle bit");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.println("Before: " + number);
        System.out.println(toBinary32(number));

        int result = number;

        if (choice == 1) {
            System.out.println(isBitSet(number, position));
        }
        else if (choice == 2) {
            result = setBit(number, position);
        }
        else if (choice == 3) {
            result = clearBit(number, position);
        }
        else if (choice == 4) {
            result = toggleBit(number, position);
        }
        else {
            System.out.println("Invalid choice");
            return;
        }

        if (choice != 1) {
            System.out.println("After: " + result);
            System.out.println(toBinary32(result));
        }

        sc.close();
    }
}