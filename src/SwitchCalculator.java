import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args)
    {
        System.out.println("*".repeat(8) + "Switch calculator" + "*".repeat(8));
        Scanner output = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = output.nextInt();

        System.out.println("Enter operator: ");
        char operator= output.next().charAt(0);

        System.out.println("Enter second number: ");
        int number2 = output.nextInt();



        switch (operator)
        {
            case '*':
                int product = number1 * number2;
                System.out.println("The product of "+ number1 + " and "+ number2 + " is: " + product);
                break;

            case '+':
                int sum = number1 + number2;
                System.out.println("The sum of "+ number1 + " and "+ number2 + " is: " + sum);
                break;

            case '-':
                int substarction = number1 - number2;
                System.out.println("The difference between "+ number1 + " and "+ number2 + " is: " + substarction);
                break;

            case '%':
                int remainder = number1 % number2;
                System.out.println("The remainder between "+ number1 + " and "+ number2 + " is: " + remainder);
                break;


            case '/':
                int division = number1 / number2;
                System.out.println("The division of "+ number1 + " and "+ number2 + " is: " + division);
                break;

            default:
                System.out.println("The operator is not recognized");

        }

        output.close();


    }
}
