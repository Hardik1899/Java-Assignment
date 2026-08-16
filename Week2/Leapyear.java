import java.util.Scanner;

public class Leapyear {

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = input.nextInt();

        if (isLeapYear(year)) {
            System.out.println("LEAP YEAR");
        }
        else {
            System.out.println("NO LEAP YEAR");
        }
    }
}