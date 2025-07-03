import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        System.out.println("<"+"*".repeat(5) + "\tCalculator\t"+"*".repeat(5)+">");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number:");

        int number1= input.nextInt();

        System.out.println("Enter the second number:");

        int number2= input.nextInt();

        int sum = number1 + number2;
        int substraction = number1 - number2;
        int multiplication = number1 * number2;
        int modulus = number1 % number2;
        int division = number1 / number2;

        System.out.println("The sum of\t"+number1+"\tand\t"+number2+"\tis:\t"+sum);
        System.out.println("The difference between\t"+number1+"\tand\t"+number2+"\tis:\t"+substraction);
        System.out.println("The product of\t"+number1+"\tand\t"+number2+"\tis:\t"+multiplication);
        System.out.println("The remainder between\t"+number1+"\tand\t"+number2+"\tis:\t"+modulus);
        System.out.println("The division of\t"+number1+"\tby\t"+number2+"\tis:\t"+division);


    }
}
