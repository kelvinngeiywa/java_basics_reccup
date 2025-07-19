package Projects;

import java.util.Scanner;

public class Registration {
    public static void main(String[]args){
        System.out.println("*".repeat(5)+"Registration System"+"*".repeat(5));
        Scanner output = new Scanner(System.in);

        System.out.println("Do you want to login (yes/no): ");
        String response= output.nextLine();

        if(response.equalsIgnoreCase("yes")){
            System.out.println("Do you have an account? ");
            String input= output.nextLine();
             switch(input.toLowerCase()){
                 case "yes":
                     System.out.println("Please login: ");
                     System.out.println("*".repeat(10));
                     System.out.println("Enter your username: ");
                     String username = output.nextLine();
                     System.out.println("Enter your password: ");
                     String password = output.nextLine();
                     System.out.println("Welcome back "+ username +" your password is "+ password +"!!");
                      System.out.println("Login successful!!!");
                      break;

                 case "no":
                     System.out.println("Please register: ");
                     System.out.println("*".repeat(10));
                     System.out.println("Enter your email: ");
                     String email = output.nextLine();
                     System.out.println("Enter your password: ");
                     String passwordd = output.nextLine();
                     System.out.println("Welcome "+ email +" your password is "+ passwordd +"!!");
                     System.out.println("Registration successful!!!");
                     break;

                 default:
                     System.out.println("Invalid input");
             }

        } else if(response.equalsIgnoreCase("no")){
            System.out.println("You can explore our main and about page");

        }
        else{
            System.out.println("Invalid input");
        }

        output.close();

    }
}
