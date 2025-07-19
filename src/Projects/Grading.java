package Projects;

import java.util.Scanner;

public class Grading {
    public static void main(String[]args){
        System.out.println("*".repeat(5)+"Grading system"+"*".repeat(5));
        Scanner output = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int score = output.nextInt();


        if(score > 0 && score <= 100){

            int gradeLevel= score >= 80 ? 1: score >= 70 ? 2:
                    score >= 60 ? 3: score >= 50 ? 4:
                            score >= 40 ? 5: score >=30 ? 6: score >= 25 ? 7 : 0;



            switch(gradeLevel){

                case 1:
                    System.out.println("Your grade is 'A'");
                    System.out.println("Congratulations, keep the flame burning");
                    break;

                case 2:
                    System.out.println("Your grade is 'B+'");
                    System.out.println("Good,Keep the flame burning");
                    break;

                case 3:
                    System.out.println("Your grade is 'B");
                    System.out.println("Good, keep the flame burning");
                    break;

                case 4:
                    System.out.println("Your grade is 'C+'");
                    System.out.println("Fair, keep the flame burning");
                    break;

                case 5:
                    System.out.println("Your grade is 'C'");
                    System.out.println("Fair, keep the flame burning");
                    break;

                case 6:
                    System.out.println("Your grade is 'D+'");
                    System.out.println("Poor, you can do better");
                    break;

                case 7:
                    System.out.println("Your grade is 'D'");
                    System.out.println("Poor, You can do better");
                    break;

                default:
                    System.out.println("Your grade is 'E'");
                    System.out.println("Poor, Put more effort ");
                    
            }

        } else{
            System.out.println("Invalid score!!");
        }

        output.close();
    }
}
