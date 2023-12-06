package question_5.bankaccount;

import java.util.Scanner;

/* class 'BankAccount' is a bank account with account number and balance
   that allows users to set an account number and deposit money */
public class BankAccount {

    // private class instance variables/properties
    private int accountNumber;
    private double balance;

    /* getter method to retrieve the account number
       return - the account number */
    public int getAccountNumber() {
        return accountNumber;
    }// end getter method 'getAccountNumber'

    /* setter method to set the account number
       parameter - 'accountNumber' the account number to set */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }// end setter method 'setAccountNumber'

    /* getter method to retrieve the balance.
       return - the 'balance' amount/value */
    public double getBalance() {
        return balance;
    }// end getter method 'getBalance'

    /* setter method to set the balance
       parameter - 'balance' the balance amount to set */
    public void setBalance(double balance) {
        this.balance = balance;
    }// end setter method 'setBalance'

    /* method 'main' to show the usage of 'BankAccount' class in action */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // instanciate 'BankAccount' object/class
        BankAccount account = new BankAccount();

        // ask user for input to set account number
        System.out.print("Enter the account number: ");
        int accNumber = scanner.nextInt();
        account.setAccountNumber(accNumber);

        // print current balance
        System.out.println("Current Balance: $" + account.getBalance());

        // ask user for input to change balance
        System.out.print("Deposit your money: $");
        double depositAmount = scanner.nextDouble();

        // update account balance using setter method
        double newBalance = account.getBalance() + depositAmount;
        account.setBalance(newBalance);

        // print updated balance
        System.out.println("Updated Balance: $" + account.getBalance());

        // close scanner
        scanner.close();
    }// end method 'main'
    
}// end class 'BankAccount'
