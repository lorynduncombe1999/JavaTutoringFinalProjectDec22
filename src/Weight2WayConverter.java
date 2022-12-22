/* Week 7 Homework
This is a program to convert LB to KG and vice versa.
*/
import java.util.Scanner;
public class Weight2WayConverter {
    public static void main(String[] args){
//Creating scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight number: ");
//creating variables
        double weightValue = input.nextDouble();
        System.out.print("Enter the weight unit (lb or kg)");
        String unit = input.next();
//creating else if statement
        if(unit.equals("lb")){
            double kg = lbToKg(weightValue);
            System.out.println("Your weight is "+ kg+ " in KG.");
        }
        else if(unit.equals("kg")){
            double lb= kgToLb(weightValue);
            System.out.println("Your weight is "+ lb+ " in LB.");
        }
    }
    //creating different method
    public static double lbToKg(double x){
        return x*0.454;
    }
    public static double kgToLb(double x){
        return x/2.205;
    }

}
