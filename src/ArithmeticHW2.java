/* MIS350 HW2 Q1
   09/11/2022
   This program calculates sum, average and product
   of three user-input integers
*/
import java.util.Scanner;

public class ArithmeticHW2 {
    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int number3;
        int sum;
        double average;
        int product;
        int min;
        int max;

        System.out.print("please enter your first integer number: ");
        number1 = input.nextInt();

        System.out.print("Please enter your second integer number: ");
        number2 = input.nextInt();

        System.out.print("Please enter your third integer number: ");
        number3 = input.nextInt();

        sum = number1 + number2;
        average = (double)(number1 + number2 + number3) / 3 ;
        product = number1 * number2 * number3 ;
        max = number1;
        min = number1;
        if(max<number2){
            max = number2;
        }
        if(max<number3){
            max = number3;
        }

        if(min>number2){
            min = number2;
        }
        if(min>number3){
            min = number3;
        }



        System.out.printf( "The sum of these two numbers is %d.\n", sum );
        System.out.printf( "The average of these two numbers is %,.2f.\n", average );
        System.out.printf( "The product of these two numbers is %d.\n", product );
        System.out.printf("The maximum value of these number is %d. \n",max);
        System.out.printf("The minimum value of these numbers is %d. \n",min);

    }
}
