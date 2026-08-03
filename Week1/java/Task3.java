import java.util.Scanner;

public class Task3 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Temperature in Celsius: ");
        double temp = input.nextDouble();

        double ftemp = temp * 9.0/5 + 32;

        System.out.println("Your Temp in Fahrenheit Scale: " + ftemp);

    }


}
