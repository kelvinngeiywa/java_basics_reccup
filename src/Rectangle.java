import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        System.out.println("<" + "-".repeat(5) + "Rectangle project" + "-".repeat(5) + ">");

        //Create an object from scanner class - use new keyword to initialize it
        Scanner output = new Scanner(System.in);

        //Ask for the value of length from user;
        //Store the user input in a variable of int type
        System.out.println("Please enter the value of length: ");
        int length = output.nextInt();  //nextInt() is for capturing user input of integer type

        // Ask for the value of width
        // Store the value of width in a variable
        System.out.println("Please enter the value of width: ");

        int width = output.nextInt();

        //calculate the area of the rectangle
        int area = length * width;

        System.out.println("The area of\t" + length + "\tand\t" + width + "\tis:\t" + area );

        output.close();
    }
}
