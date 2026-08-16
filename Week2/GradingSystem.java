import java.util.Scanner;

public class GradingSystem {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter your marks: ");
        int marks = input.nextInt();

        if(marks >= 80 && marks < 100){
            System.out.println("Distinction");
        }
        else if(marks >= 70 && marks < 79){
            System.out.println("Merit");
        }
        else if(marks >= 50 && marks < 69){
            System.out.println("Pass");
        }
        else if(marks <= 49){
            System.out.println("Fail");
        }
        else{
            System.out.println("Invalid");
        }

    }

}
