import java.util.Scanner;
public class Patriot5k {
    // -Process 1

    //Calculates BMI
    public static double bmiCalculate(double weight, double height) {
        double bmi = lb2KG(weight) / (inch2MT(height) * inch2MT(height));
        System.out.println("Your BMI Value is " + bmi + ".");
        return bmi;
    }

    //Weight and height conversion methods needed as BMI calculations are done in meters and kilograms
    // Converts inches into meters
    public static double inch2MT(double hInch) {
        double hMeter = hInch * 0.0254;
        return hMeter;
    }

    // Converts pounds to kilograms
    public static double lb2KG(double wLB) {
        double wKG = wLB * 0.454;
        return wKG;
    }


    //This method calculates how many pounds a user needs to lose per week to reach their goal
    public static double poundsToLoosePerWeek(double currentWeight, double goalWeight, int weeksOfTraining) {
        double poundsToLoose = currentWeight - goalWeight;
        double poundsPerWeekToLoose = poundsToLoose / weeksOfTraining;
        return poundsPerWeekToLoose;
    }

    // -- Process 2

    //This method helps  the user set the days of the week they would like to work out and helps it fit the workout plan
    public static String[] daysOfWeekToExercise(double poundsPerWeek) {

        //the number of days needed to exercise to hit their goal and determines the size of the array returned
        int daysToExercise = 0;

        // a series of if statements that set the number of days to workout per week to hit the users workout goals
        if (poundsPerWeek < 2) {
            System.out.println("You need to enter 2 days of the week you would like to exercise: ");
            daysToExercise = 2;
        } else if (3 <= poundsPerWeek || poundsPerWeek < 5) {
            System.out.println("You need to enter 4 days of the week you would like to exercise: ");
            daysToExercise = 4;
        } else {
            System.out.println("You need to enter 6 days of the week you would like to exercise: ");
            daysToExercise = 6;
        }

        //Creating an array that is the size of days needed to exercise to hit goal
        String[] dayToExerciseArr = new String[daysToExercise];

        Scanner methodScanner = new Scanner(System.in);

        //inserts the days of the week the user wants to exercise in the array
        for (int i = 0; i < dayToExerciseArr.length - 1; i++) {
            System.out.println("Please enter a day of the week: ");
            dayToExerciseArr[i] = methodScanner.nextLine();
        }

        return dayToExerciseArr;


    }

    //This method determines running level based off of user input
    public static int runnerLevel() {
        int runnerLevel = 0;
        Scanner methodScanner = new Scanner(System.in);

        //allows for the dowhile loop to end
        boolean flag = false;

        //this do-while loop keeps prompting user for running level in integer form and sets that level

        do {
        System.out.println("Please enter your running level(1 = beginner, 2 = intermediate, and 3 = advanced runner.)");
        runnerLevel = methodScanner.nextInt();
        if (runnerLevel == 1) {
            flag = true;


        } else if (runnerLevel == 2) {

            flag = true;

        } else if (runnerLevel == 3) {
            flag = true;
        } else {
            System.out.println("You have entered an invalid running level. Please try again");
        }

    }while(flag ==false);
        return runnerLevel;

}

//--Process 3
    //This method takes in an array of days to workout, the number of weeks a user needs to work out and their running level to determine if their time workout goal is being met
public static void weeklyTrainingGoals(String[] daysToWorkout, int numberOfWeeksToWorkout,int runnerLevel){

        // the total number of minutes the user has workout
        int workoutMinutes = 0;

        //variable that user inputs and states what training week they are on
        int trainingWeek = 0;

        Scanner methodScanner = new Scanner(System.in);

        System.out.println("Please enter what training week you are currently on: ");
        trainingWeek = methodScanner.nextInt();

        //For loop in for loop that allows users to input the number of minutes they've worked out per workout week/ day
        for(int i=0; i<numberOfWeeksToWorkout;i++){
            for (String day: daysToWorkout) {
                System.out.println("Please enter the amount of time you worked out on "+ day);

                workoutMinutes+=methodScanner.nextInt();
            }
        }

        //based off of running level (Beg,inter,adv, it determines the minimum amount of
        //total minutes needed to hit goal multiplied by amount of days to workout multiplied by the number of weeks needed to train(numberofWeeksToWorkout-trainingWeek) )

      if(runnerLevel == 1){
          if(workoutMinutes>=(60*daysToWorkout.length-1)*(numberOfWeeksToWorkout-trainingWeek)){
              System.out.println("Congrats! You have met your weekly training goals. Keep up the good work!");
          }else
              System.out.println("You are on the right track lets aim to train more next week!");
    }
      else if (runnerLevel == 2) {
          if(workoutMinutes>=(90*daysToWorkout.length-1)*(numberOfWeeksToWorkout-trainingWeek)){
              System.out.println("Congrats! You have met your weekly training goals. Keep up the good work!");
          }else
              System.out.println("You are on the right track lets aim to train more next week!");
    }
    else{
          if(workoutMinutes>=(120*daysToWorkout.length-1)*(numberOfWeeksToWorkout-trainingWeek)){
              System.out.println("Congrats! You have met your weekly training goals. Keep up the good work!");
          }else
              System.out.println("You are on the right track lets aim to train more next week!");

    }



}


//--Process 4

    //This method helps user determine if they have hit their weight loss goal based off of the pounds per week needed to hit their goal and the weeks of training needed
    public static void weightLossGoals(double poundsPerWeek,int weeksOfTraining){
        Scanner methodScanner = new Scanner(System.in);
        System.out.println("Please enter your current training week: ");

        int trainingWeek = methodScanner.nextInt();

        //An array that is the size of the number of weeks a person has left in the program
        int[] weightLossPerWeek = new int[weeksOfTraining-trainingWeek];

        //user enters their weightloss per week
      for(int i =0; i<weightLossPerWeek.length-1;i++){
          System.out.println("Please enter your weight for week "+ weightLossPerWeek[i]);
          weightLossPerWeek[i] = methodScanner.nextInt();

      }

      //compares user input to the pounds per week needed to hit goal.
        for (int pounds:weightLossPerWeek) {
            if(pounds>=poundsPerWeek){
                System.out.println("Congrats you've met your weekly weightloss goal");
            }
            else
                System.out.println("Keep up the hard work, don't give up, you can do this!");
        }




    }public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //prompt user to take input of current weight
        System.out.println("Please enter your current weight in pounds(lbs): ");
        double userWeight = scanner.nextDouble();

        //prompt user to take input of current height
        System.out.println("Please enter your current height in inches(in): ");
        double userHeight = scanner.nextDouble();

        double userBMI = bmiCalculate(userWeight, userHeight);

        double poundsPerWeek = 0;
        int numberOfWeeksToTrain =0;

        //If userBMI is >= 25 they are overweight/obese
        if (userBMI >= 25) {
            //if the user is overweight or obese then prompt the user to input goal weight
            System.out.println("Please input your goal weight in pounds(lbs)");
            double userGoalWeight = scanner.nextDouble();

            // input how many weeks they want to train, and display
            System.out.println("Please input the number of weeks you would like to train");
            numberOfWeeksToTrain = scanner.nextInt();

            // stores the pounds to loose per week function in a variable named pounds per week so that it can be used for later use
            poundsPerWeek = poundsToLoosePerWeek(userWeight, userGoalWeight, numberOfWeeksToTrain);

            System.out.println("In order to reach your goal you need to loose " + poundsPerWeek + " pounds a week");
        }

        //User is not overweight/obese
        else {

            // input how many weeks they want to train, and display
            System.out.println("Please input the number of weeks you would like to train");
             numberOfWeeksToTrain = scanner.nextInt();

            System.out.println("Your current weight is " + userWeight + " lbs" + " and you would like to train for " + numberOfWeeksToTrain + " weeks.");
        }

        System.out.println("We will now help you determine how many days a weeks you should exercise");

        //Stores the days a user wants to workout in a string array
        String[] daysToWorkout = daysOfWeekToExercise(poundsPerWeek);

        System.out.println("We will now determine your running level");

        //stores runner level function in a variable called runnerlevel for later use
        int runnerLevel = runnerLevel();

        //This series of if statements prints out the days a user needs to workout and how many minutes per day a user should workout based on their information
       if(runnerLevel == 1){
           for (String day: daysToWorkout) {
               System.out.println("Work out on "+ day+" for 60 minutes");
           }
       }

        else if (runnerLevel == 2){
           for (String day: daysToWorkout) {
               System.out.println("Work out on "+ day+" for 90 minutes");
           }
       }

       else if(runnerLevel ==3){
           for (String day: daysToWorkout) {
               System.out.println("Work out on "+ day+" for 120 minutes");
           }

       }


       System.out.println("Now we will determine if you have met your weekly weightloss goal if your BMI is over 25");
       if(userBMI >=25)
       {
        weightLossGoals(poundsPerWeek,numberOfWeeksToTrain);

       }

    System.out.println("Thank you for using our Patriot 5k Program !");
    }
}

