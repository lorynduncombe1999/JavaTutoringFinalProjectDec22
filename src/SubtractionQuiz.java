/*  week 5 homework
09/25/2022
This program will display a 10 question subtraction quiz and will show how many questions
were answered correctly and incorrectly
*/
import java.util.Scanner;
import java.util.Random;
public class SubtractionQuiz {
    public static void main(String[] args) {
//Creating scanner
        Scanner input = new Scanner(System.in);
        Random rNums = new Random();
        int correct =0;
        int incorrect = 0;
        int counter =0;
//creating repetition structure
        do {
            int num1 = rNums.nextInt(16);
            int num2 =rNums.nextInt(16);
//Creating if statement
            if(num2>num1) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            System.out.print("What is " + num1 + " - " + num2 + "? ");
            int answer = input.nextInt();
            if(num1-num2==answer){
                System.out.println("Correct!");
                correct++;
            }
            else{
                System.out.println("Incorrect");
                incorrect++;
            }
            counter++;
        } while (counter!=10);
//displaying results
        System.out.printf("You got %d questions correct and %d questions incorrect in this 10-question quiz. \n", correct, incorrect);
    }
}
