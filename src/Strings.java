public class Strings {
    public static void main(String[]args){
        String word="Good morning";
        System.out.println("You've said\t"+word);
        int length_of_string= word.length(); //Find length of a string
        System.out.println("The length of\t"+word+"\tis\t"+ length_of_string);

        //To uppercase
        String word_to_uppercase= word.toUpperCase();
        System.out.println("The uppercase of "+word+" is "+ word_to_uppercase);
        //to lowercase
        String word_to_lowercase = word.toLowerCase();
        System.out.println("The lowercase of "+word+" is "+word_to_lowercase);

        //Find index of / position of a character
        int index_of= word.indexOf('r');
        System.out.println("The position of 'r' in " +word+" is "+ index_of);
    }
}
