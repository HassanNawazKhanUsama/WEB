import java.util.InputMismatchException;
import java.util.Scanner;
public class InputMismatchExceptionHandling {

    public static void main(String[] args) {
        System.out.println("HASSAN KHAN");
        System.out.println("21-ARID-717");
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = input.nextInt();
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException caught: Invalid input. Please enter an integer.");
        }
    }
}