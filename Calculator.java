import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println(" "); // Blank
        System.out.println("Welcome to Daddy's Calculator!!!");
        System.out.println("Enter the following number in one like this example:");
        System.out.println("1 + 1 = Answer");
        System.out.println(" "); // Blank
        System.out.print("Enter a number: ");

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
