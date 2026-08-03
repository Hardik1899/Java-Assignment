import java.util.Scanner;

// Calculator as instructed in Task 2 in assignment 1.

public class Task1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        double a = input.nextDouble();

        System.out.print("Enter your second number: ");
        double b = input.nextDouble();

        System.out.print("Enter operator for calculation(+, -, /, x, %): ");
        String op = input.next();

        if(op.equals("+")){
            System.out.println("Result: " + (a+b));
        }
        else if(op.equals("-")){
            System.out.println("Result: " + (a-b));
        }
        else if(op.equals("x")){
            System.out.println("Result: " + (a*b));
        }
        else if(op.equals("/")){
            System.out.println("Result: " + (a/b));
        }
        else if(op.equals("%")){
            System.out.println("Result: " + (a%b));
        }
    }
}

