import java.util.Scanner;

public class TwoSeparateExceptions {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("This program takes two numbers and divides them");

            System.out.print("Please enter num1: ");
            int num1 = scanner.nextInt();

            System.out.print("Please enter num2: ");
            int num2 = scanner.nextInt();

            int num3 = num1 / num2;

            System.out.println(num3);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic operation not allowed");

        } catch (Exception e) {
            System.out.printf("The following error occurred %s", e);
        }
    }
}
