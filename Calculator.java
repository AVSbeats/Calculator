import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println(" "); // Blank
        System.out.println("Welcome to Daddy's Calculator!!!");
        System.out.println("Enter the following number like to get answer");
        System.out.println("(Number Operator Number) = Answer");
        System.out.println(" "); // Blank
        System.out.println("Enter a number: ");

        Scanner input = new Scanner(System.in);
        double number1 = input.nextDouble();
        char operator = input.next().charAt(0); // This is to read the (+,-,*,/)
        double number2 = input.nextDouble();

        if (operator == '+') {
            System.out.print("Total is ");
            System.out.println((int) (number1 + number2));
            System.out.println(" "); // Blank

        } else if (operator == '-') {
            System.out.print("Total is ");
            System.out.println((int) (number1 - number2));
            System.out.println(" "); // Blank

        } else if (operator == '*') {
            System.out.print("Total is ");
            System.out.println((int) (number1 * number2));
            System.out.println(" "); // Blank

        } else if (operator == '/') {
            System.out.print("Total is ");
            System.out.println((Double) (number1 / number2));
            System.out.println(" "); // Blank

        } else {
            System.out.print("Total is ");
            System.out.println("Invalid input");
            System.out.println(" "); // Blank
        }

    }
}
