import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        // This is my comment for lab 6
        // It's is 20 October 2021
        //Having so much fun in class
        Scanner scan = new Scanner(System.in);

        // Receive first number
        System.out.print("Enter first operand: ");
        double first = scan.nextDouble();

        //Receive second number
        System.out.print("Enter second operand: ");
        double second = scan.nextDouble();

        //Print calculator menu
        System.out.println("");
        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("");

        //Ask user which operation to perform on the 2 numbers
        System.out.print("Which operation do you want to perform? ");
        int operation = scan.nextInt();

        //if statement to see which operation needs to be executed
        if(operation == 1){
            System.out.println("The result of the operation is " + (first + second) + ". Goodbye!");
        } else if(operation == 2){
            System.out.println("The result of the operation is " + (first - second) + ". Goodbye!");
        } else if(operation == 3){
            System.out.println("The result of the operation is " + (first * second) + ". Goodbye!");
        } else if(operation == 4){
            System.out.println("The result of the operation is " + (first / second) + ". Goodbye!");
        } else{
            System.out.println("Error: Invalid selection! Terminating program.");
        }

    }
}
