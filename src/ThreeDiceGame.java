import java.util.Scanner;
import java.util.Random;
/* Week 5 Homework
09/25/2022
This program will count how many even number were generated out of the 100 attempts
*/
public class ThreeDiceGame {
            public static void main(String[] args) {
            int evenRolls = 0;//creating scanner
            Scanner input = new Scanner(System.in);
            Random rNums = new Random();
//creating repetition structure
            for (int qcount = 0; qcount < 100; qcount++) {
                int attemptOne = rNums.nextInt(7);
                int attemptTwo = rNums.nextInt(7);
                int attemptThree = rNums.nextInt(7);
                int sum = attemptOne + attemptTwo + attemptThree;
                System.out.println("Attempt#" + qcount + ":" + "You got " + attemptOne + ", " + attemptTwo + ", " + attemptThree);
                if (sum % 2 == 0)
                    evenRolls++;
            }//display the results
            System.out.println("You have completed 100 attempts, within which, you got a total of " + evenRolls + " that are even");
        }
    }

