/* Week 7 Homework
This program will calculate area and perimeter of a circle with certain radius number given by the user.
*/
import java.util.Scanner;
public class ComputeCircle {
    public static void main(String[] args) {
        System.out.println("Enter a radius value in cm for your circle: ");
        double value;
//creating scanner
        Scanner input = new Scanner( System.in );
        System.out.print("Enter a radius:");
        value = input.nextDouble();
        double area = computeArea(value);
        double perimeter = computePerimeter(value);
//message that is going to be displayed
        System.out.println("The area of your circle is "+area+" squared cm.");
        System.out.println("The perimeter of your circle is "+ perimeter + " cm.");
    }
    //formula for area and perimeter
//creating second method
    public static double computeArea(double x){
        return 3.1415926*x*x;
    }
    public static double computePerimeter(double x){
        return 2 * 3.1415926 * x;
    }
}
