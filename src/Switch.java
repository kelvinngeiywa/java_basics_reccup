import java.util.Scanner;

public class Switch {
    public static void main(String[] args)
    {
        System.out.println("+".repeat(10) + "Switch statement" + "+".repeat(10));
        Scanner output = new Scanner(System.in);
        System.out.println("Enter a number");
        int digit = output.nextInt();
        int rem = digit % 2;

        switch (rem){
            case 0:
                System.out.println(digit + " Is a prime number");
                break;

            case 1:
                System.out.println( digit + " Is an odd number");
                break;

            default:
                System.out.println("Invalid value");

        }

        output.close();
    }
}
