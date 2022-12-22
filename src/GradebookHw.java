/* Homework 9
This program is to display gradebook table and be able to display the highest and lowest grade of a specific
student. It will be able to find a student and display the average of the midterm and final grade.
*/
import java.util.Scanner;
public class GradebookHw {
    //main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//create 2 String arrays for stud ID and names
        String[] studID = {"G001", "G002", "G003", "G004", "G005"};
        String[] studName = {"Mary", "Abby", "Joe", "Mark", "Julie"};
//Create 2 double arrays for grades
        double[] mGrade = new double[5];
        double[] fGrade = new double[5];
//Enter grades
        System.out.printf("Please enter midterm exam grades for %d students.\n", mGrade.length);
        for (int i = 0; i < mGrade.length; i++) {
            System.out.print(studName[i] + ": ");
            mGrade[i] = input.nextDouble();
        }
        System.out.printf("Please enter final exam grades for %d students.\n", fGrade.length);
        for (int i = 0; i < fGrade.length; i++) {
            System.out.print(studName[i] + ": ");
            fGrade[i] = input.nextDouble();
        }
//Display the grade table
//Table head and seperating line
        System.out.println("|\t\tStud ID\t\t|\t\tStud Names\t\t|\t\tMidterm\t\t|\t\tFinal\t\t|");
        System.out.println("-----------------------------------------------------------------------");
//Student records
        for (int i = 0; i < studID.length; i++) {
            System.out.printf("|\t\t%-7s\t\t|\t\t%-10s\t\t|\t\t%7.1f\t\t|\t\t%5.1f\t\t|\n", studID[i], studName[i], mGrade[i], fGrade[i]);
        }
//Ending line and average
        System.out.println("--------------------------------------------------------------------------");
//Call the average method to get the averages
//System.out.printf("|\t\tAverage:\t\t\t\t\t\t\t\t\t|\t\t%7.1\t\t|\t\t5.1f\t\t|\n", gradeAvg(mGrade), gradeAvg(fGrade));
        System.out.println("The highest midterm score was: " + findHighest(mGrade));
        System.out.println("The highest final score was: " + findHighest(fGrade));
        System.out.println("The lowest midterm score was: " + findLowest(mGrade));
        System.out.println("The lowest final score was: " + findLowest(fGrade));
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a name to search in the gradebook ");
        String name = sc.nextLine();
        int returnedIndex = search(name,studName);
        if(returnedIndex != -1){
            double totalGrade = (mGrade[returnedIndex]+fGrade[returnedIndex])/2;
            System.out.println(name +" total grade is "+totalGrade);
        }
        else System.out.println("Cannot find student");
    }
    /*
    //average method
    public static double gradeAvg(double[] g) {
    double total = 0;
    for (int i = 0; i < g.length; i++) {
    total += g[i];
    }
    return total / g.length;
    }
    */
    public static double findHighest(double[] gradebook) {
        double highestNumber = gradebook[0];
        for (int i = 0; i < gradebook.length - 1; i++) {
            if (highestNumber < gradebook[i]) {
                highestNumber = gradebook[i];
            }

        }
        return highestNumber;
    }
    public static double findLowest(double[] gradebook) {
        double lowestNumber = gradebook[0];
        for (int i = 0; i < gradebook.length - 1; i++) {
            if (lowestNumber > gradebook[i]) {
                lowestNumber = gradebook[i];
            }
        }
        return lowestNumber;
    }
    public static int search(String name, String[] names) {
        for(int i = 0; i < names.length-1; i++) {
            if (names[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
