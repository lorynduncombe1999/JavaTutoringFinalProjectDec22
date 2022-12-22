/* Homework 11
This is a java program that provides banking services through an ATM system
*/
import java.util.*;
import java.util.Calendar;
public class Accounts {
    String AccountID;
    String Name;
    double CheckingBalance;
    double SavingsBalance;
    //Default Constructor
    public Accounts(){
    }
    //Customized Constructor
    public Accounts(String accountID, String name, double checkingBalance, double savingsBalance) {
        AccountID = accountID;
        Name = name;
        CheckingBalance = checkingBalance;
        SavingsBalance = savingsBalance;
    }
    public void SetAccountID(String accountID) {
        AccountID = accountID;
    }
    public void SetCheckingBalance(double checkingBalance) {
        CheckingBalance = checkingBalance;
    }
    public void SetName(String name) {
        Name = name;
    }
    public void SetSavingsBalance(double savingsBalance) {
        SavingsBalance = savingsBalance;
    }
    //Deposit an amount to checking
    public void DepositChecking(double DepositAmount){
        CheckingBalance+=DepositAmount;
        System.out.println("Deposit amount of "+ DepositAmount+" has been successfully deposited into your Checking Account");
    };
    //Deposit an amount to savings
    public void DepositSavings(double DepositAmount){
        SavingsBalance+=DepositAmount;
        System.out.println("Deposit amount of "+ DepositAmount+" has been successfully deposited into your Checking Account");
    };
    //Withdraw an amount to checking... sufficient funds check
    public void WithdrawChecking(double WithdrawAmount){
        if(WithdrawAmount>CheckingBalance){
            System.out.println("Sorry this action cannot be completed as your withdraw amount is larger than your current Checking Account Balance");
        }
        else{
            CheckingBalance-=WithdrawAmount;
            System.out.println("Withdraw amount of "+ WithdrawAmount+" has been successfully deposited into your Checking Account");
        }
    };
    //Withdraw an amount to savings...sufficient funds check
    public void WithdrawSavings(double WithdrawAmount){
        if(WithdrawAmount>SavingsBalance){
            System.out.println("Sorry this action cannot be completed as your withdraw amount is larger than your current Checking Account Balance");
        }
        else{
            SavingsBalance-=WithdrawAmount;
            System.out.println("Withdraw amount of "+ WithdrawAmount+" has been successfully deposited into your Savings Account");
        }
    };
    //Transfer an amount from checking to savings
    public void TransferToSavings(double TransferAmount){

        if(TransferAmount>CheckingBalance){
            System.out.println("Sorry this action cannot be completed as your requested transfer amount is larger than your current Checking Account Balance");
        }
        else{
            CheckingBalance-=TransferAmount;
            SavingsBalance+=TransferAmount;
            System.out.println("Transfer amount of "+ TransferAmount+" has been successfully deposited into your Savings Account");
        }
    };
    // Transfer an amount from savings to checking
    public void TransferToChecking(double TransferAmount){
        if(TransferAmount>SavingsBalance){
            System.out.println("Sorry this action cannot be completed as your requested transfer amount is larger than your current Savings Account Balance");
        }
        else{
            SavingsBalance-=TransferAmount;
            CheckingBalance+=TransferAmount;
            System.out.println("Transfer amount of "+ TransferAmount+" has been successfully deposited into your Checking Account");
        }
    };
    /*
    7. Print/display receipt, including the account ID, account name, the current date and
    time (using the Calendar class) and the finishing balances in both checking and
    savings.
    */
    public void Receipt(){
        Calendar now = Calendar.getInstance();
        System.out.println(now.getTime());
        System.out.println("Account ID: " + AccountID);
        System.out.println("Customer Name: " + Name);
        System.out.println("Checking Account Balance: " + CheckingBalance);
        System.out.println("Saving Account Balance: " + SavingsBalance);

    }
}
