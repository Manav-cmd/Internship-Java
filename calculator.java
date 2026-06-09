import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Calculator Menu =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Celsius to Fahrenheit");
            System.out.println("8. Fahrenheit to Celsius");
            System.out.println("9. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            double a, b;

            switch (choice) {

                case 1:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result = " + (a + b));
                    break;

                case 2:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result = " + (a - b));
                    break;

                case 3:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result = " + (a * b));
                    break;

                case 4:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();

                    if (b != 0)
                        System.out.println("Result = " + (a / b));
                    else
                        System.out.println("Division by zero is not allowed.");

                    break;

                case 5:
                    System.out.print("Enter a number: ");
                    a = sc.nextDouble();

                    if (a >= 0)
                        System.out.println("Square Root = " + Math.sqrt(a));
                    else
                        System.out.println("Cannot calculate square root of negative number.");

                    break;

                case 6:
                    System.out.print("Enter base: ");
                    a = sc.nextDouble();
                    System.out.print("Enter exponent: ");
                    b = sc.nextDouble();

                    System.out.println("Answer = " + Math.pow(a, b));
                    break;

                case 7:
                    System.out.print("Enter temperature in Celsius: ");
                    a = sc.nextDouble();
                    System.out.println("Fahrenheit = " + ((a * 9 / 5) + 32));
                    break;

                case 8:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    a = sc.nextDouble();
                    System.out.println("Celsius = " + ((a - 32) * 5 / 9));
                    break;

                case 9:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 9);

        sc.close();
    }
}
