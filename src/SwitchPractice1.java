import java.util.Scanner;

public class SwitchPractice1 {
    public static void main(String[] args){
        System.out.println("-".repeat(5)+"Vowel consonant"+"-".repeat(5));
        Scanner output = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        char letter = output.next().charAt(0);

        switch (letter){
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                System.out.println(letter+" is a vowel");
                break;

            default:
                System.out.println(letter +" is a consonant");

        }

        output.close();
    }
}
