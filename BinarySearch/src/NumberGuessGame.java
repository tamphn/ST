import java.util.Scanner;

public class NumberGuessGame {
    public static void guessNumber(int lowVal, int highVal, Scanner scnr) {
        int midVal;
        char userAnswer;
        midVal = (highVal + lowVal) / 2;

        System.out.println("Is it " + midVal + "? (l/h/y): ");
        userAnswer = scnr.next().charAt(0);

        if((userAnswer != 'l') && (userAnswer != 'h')) {        //Base case
            System.out.println("Thank you!");                   //Found number
        } else {                 //Recursive case: split into lower or upper half
            if(userAnswer == 'l') {         //Guess in low half
                guessNumber(lowVal,midVal,scnr);    //Recursive calls
            } else {                        //Guess in upper half
                guessNumber(midVal + 1, highVal, scnr); //Recursive calls
            }
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Choose a number from 0 to 100 ");
        System.out.println("Answer with: ");
        System.out.println("   l - your num is lower");
        System.out.println("   h - your num is higher");
        System.out.println("   any other key(guess is right");

        guessNumber(0,100,scnr);
    }
}
