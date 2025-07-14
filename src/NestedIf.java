import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args)
    {
        Scanner output= new Scanner(System.in);
        System.out.println("Enter your grade: ");

        String grade = output.nextLine();

        if (grade.equals("A")){
            System.out.println("Enter household income: ");
            double income = output.nextDouble();
            if(income <= 15000){
                System.out.println("Eligible for full scholarship");
            } else if (income > 15000 && income <= 50000 ){
                System.out.println("You qualify for partial scholarship");


            } else if (income > 50000 && income <= 100000){
                System.out.println("You qualify for competitive selection");
            }
            else{
                System.out.println("We believe you can cater for your tuition.");
            }
        }else if (grade.equals("B")){
            System.out.println("Enter household income: ");
            double income = output.nextDouble();

            if(income <= 15000){
                System.out.println("You qualify for full scholarship");
            } else if(income >15000 && income < 50000){
                System.out.println("You qualify for competitive selection");
            } else{
                System.out.println("You don't qualify for scholarship");
            }

        } else{
            System.out.println("Not eligible for scholarship");
        }

        output.close();
    }
}
