/*
Homework 11
This is a java program that provides banking services through an ATM system
*/
import java.util.Scanner;
public class ATMServices {
    //Search Method
    public static int Search(Accounts[] accounts,int p,String accountId){
        for(int i=0;i<p;i++){
//if match is found

            if(accounts[i].AccountID.equalsIgnoreCase(accountId)){

                return i;
            }
        }
//will return -1 if match not found in for loop
        return -1;
    }
    public static void main(String[] args) {
//AccountArray
        Accounts[] AccountArray = new Accounts[10];
//Accounts to add to the array
        Accounts Account1 = new Accounts("c001","Andy",700.00,1000.00);
        Accounts Account2 = new Accounts("c002","Bailey",500.00,600.00);
        Accounts Account3 = new Accounts("c003","Caroline",850.00,1500.00);
//add accounts into Array
        AccountArray[0] = Account1;
        AccountArray[1] = Account2;
        AccountArray[2] = Account3;
//pointer that marks the end of the occupied part of the array
        int p = 3;
        Scanner Reader = new Scanner(System.in);
//Account Authentication
        System.out.println("Please enter your account ID");
        String AccountId = Reader.nextLine();
//declare amount outside of do/while loop for scoop
        int amount =0;
        do{
            amount = Search(AccountArray,p,AccountId);
            if (amount == -1){
                System.out.println("Invalid account. Try again! ");
                System.out.println("Please enter your account ID");
                AccountId = Reader.nextLine();

            }
        }while(amount==-1);
        boolean flag = true;
        System.out.println("Hello "+ AccountArray[amount].Name +" Welcome to visit ABC Bank. How can we serve you today?");
        do {
            System.out.println("1. Deposit to Checking.");
            System.out.println("2. Deposit to Saving.");
            System.out.println("3. Withdraw from Checking.");
            System.out.println("4. Deposit from Saving.");
            System.out.println("5. Transfer from Checking to Saving.");
            System.out.println("6. Deposit from Saving to Checking.");
            System.out.println("7. Exit");

            System.out.println("Please enter the service number: ");

            int serviceNumber = Reader.nextInt();
            double TransactionAmount = 0;
            switch (serviceNumber) {
                case 1:
                    do {
                        System.out.println("Please enter the transaction amount: ");

                        TransactionAmount = Reader.nextDouble();
                        if(TransactionAmount<0){

                            System.out.println("Invalid transaction amount. Please enter again ");
                        }

                        AccountArray[amount].DepositChecking(TransactionAmount);
                    }while(TransactionAmount<0);
                    break;
                case 2:
                    do {
                        System.out.println("Please enter the transaction amount: ");

                        TransactionAmount = Reader.nextDouble();
                        if(TransactionAmount<0){

                            System.out.println("Invalid transaction amount. Please enter again ");
                        }
                        AccountArray[amount].DepositSavings(TransactionAmount);
                    }while (TransactionAmount<0);
                    break;
                case 3:
                    do {
                        System.out.println("Please enter the transaction amount: ");

                        TransactionAmount = Reader.nextDouble();
                        if(TransactionAmount<0){

                            System.out.println("Invalid transaction amount. Please enter again ");
                        }
                        AccountArray[amount].WithdrawChecking(TransactionAmount);
                    }while (TransactionAmount<0);
                    break;
                case 4:
                    do {
                        System.out.println("Please enter the transaction amount: ");

                        TransactionAmount = Reader.nextDouble();
                        if(TransactionAmount<0){

                            System.out.println("Invalid transaction amount. Please enter again ");
                        }
                        AccountArray[amount].WithdrawSavings(TransactionAmount);
                    }while(TransactionAmount<0);
                    break;
                case 5:
                    do {
                        System.out.println("Please enter the transaction amount: ");

                        TransactionAmount = Reader.nextDouble();
                        if(TransactionAmount<0){

                            System.out.println("Invalid transaction amount. Please enter again ");
                        }
                        AccountArray[amount].TransferToSavings(TransactionAmount);
                    }while(TransactionAmount<0);
                    break;
                case 6:
                    do {
                        System.out.println("Please enter the transaction amount: ");

                        TransactionAmount = Reader.nextDouble();
                        if(TransactionAmount<0){

                            System.out.println("Invalid transaction amount. Please enter again ");
                        }
                        AccountArray[amount].TransferToChecking(TransactionAmount);
                    }while(TransactionAmount<0);
                    break;
                case 7:
                    System.out.println("Thank you for using ABC Bank. Please return soon!");
                    flag = false;
                    break;
                default:
                    System.out.println("Incorrect Service Selection. Please select again!");
            }
        }while (flag);
        AccountArray[amount].Receipt();

        Reader.close();
    }
}
