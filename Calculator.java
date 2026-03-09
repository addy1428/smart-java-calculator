import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n===== SMART JAVA CALCULATOR =====");
            System.out.println("1 Addition");
            System.out.println("2 Subtraction");
            System.out.println("3 Multiplication");
            System.out.println("4 Division");
            System.out.println("5 Square");
            System.out.println("6 Square Root");
            System.out.println("7 Power");
            System.out.println("8 Percentage");
            System.out.println("9 Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice){

                case 1:
                    System.out.print("Enter first number: ");
                    double a = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    double b = sc.nextDouble();
                    System.out.println("Result = " + (a+b));
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    a = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    b = sc.nextDouble();
                    System.out.println("Result = " + (a-b));
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    a = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    b = sc.nextDouble();
                    System.out.println("Result = " + (a*b));
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    a = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    b = sc.nextDouble();
                    System.out.println("Result = " + (a/b));
                    break;

                case 5:
                    System.out.print("Enter number: ");
                    a = sc.nextDouble();
                    System.out.println("Square = " + (a*a));
                    break;

                case 6:
                    System.out.print("Enter number: ");
                    a = sc.nextDouble();
                    System.out.println("Square Root = " + Math.sqrt(a));
                    break;

                case 7:
                    System.out.print("Enter base: ");
                    a = sc.nextDouble();
                    System.out.print("Enter power: ");
                    b = sc.nextDouble();
                    System.out.println("Result = " + Math.pow(a,b));
                    break;

                case 8:
                    System.out.print("Enter number: ");
                    a = sc.nextDouble();
                    System.out.print("Enter percentage: ");
                    b = sc.nextDouble();
                    System.out.println("Result = " + (a*b/100));
                    break;

                case 9:
                    System.out.println("Calculator Closed");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while(choice != 9);

        sc.close();
    }
}
