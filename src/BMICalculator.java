/* Homework 8
This is a program allows user input their weight in LBs and height in inches, and calculates BMI. According to BMI, the program will
display a message.
*/
import java.util.Scanner;
public class BMICalculator {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
// Prompt to user and take input of height and weight
        System.out.print("Please enter your height in inches: ");
        double height = input.nextDouble();
        System.out.print("Please enter your weight in lbs: ");
        double weight = input.nextDouble();
// Call the BMI calculation method
        bmiAssesment(bmiCalculate(weight,height));

    }
    // Height convert method
    public static double inch2MT (double hInch) {
        double hMeter = hInch * 0.0254;
        return hMeter;
    }
    // Weight convert method
    public static double lb2KG (double wLB) {
        double wKG = wLB * 0.454;
        return wKG;
    }
    public static double bmiCalculate(double weight,double height){
        double bmi = lb2KG(weight)/(inch2MT(height)*inch2MT(height));
        System.out.println("Your BMI Value is "+bmi+".");
        return bmi;
    }
    public static void bmiAssesment(double bmi ){
        if(bmi>30){
            System.out.println("See doctor for professional treatment");
        }
        else if (25<bmi&&bmi<30){
            System.out.println("Watch out eating and do more exercise.");
        }
        else if (18.5<bmi&&bmi<25){
            System.out.println("Keep it up!");
        }
        else
            System.out.println("Eat more and gain weight.");
    }
}
