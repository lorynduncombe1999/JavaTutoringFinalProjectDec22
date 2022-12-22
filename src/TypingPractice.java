/* Homework 5
This program will display a letter that the user will have to type. After 1 minute, the program will display the results.
*/

import java.util.Scanner;
import java.util.Random;
public class TypingPractice {
    public static void main(String[] args) {
        Random rNums = new Random();
        Scanner input = new Scanner( System.in );
//creating variables
        int correctLetters = 0;
        int incorrectLetters = 0;
        long startTime, endTime;
        long timeElapsed = 0;
        startTime = System.currentTimeMillis();
//creating while statement
        while(timeElapsed / 1000 <= 60){
            char rChar = (char)('a' + rNums.nextInt(26));
            System.out.println("Please type: "+ rChar);
            char typedLetter = input.next().charAt(0);
            if(typedLetter == rChar){
                correctLetters+=1;
            }
            else incorrectLetters+=1;
            endTime = System.currentTimeMillis();
            timeElapsed = endTime - startTime;
        }
        int totalLettersTyped = correctLetters+incorrectLetters;
//message that will be displayed
        double percentageCorrect =( ((double) correctLetters/(double)totalLettersTyped)*100);
        System.out.println("Congrats! Within 1 minute, you typed "+ totalLettersTyped+" letters.\n You are "+percentageCorrect+" % correct in this practice");
    }
}
