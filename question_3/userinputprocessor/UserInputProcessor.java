package question_3.userinputprocessor;

import java.util.Scanner;


/* class 'UserInputProcessor' determines whether the user input is a number or a string 
   by utilizing method overloading to check the input type and processing user input */
public class UserInputProcessor {

    // method 'checkInput' to check if the input is a number
    public static boolean checkInput(int number) {
        return true; // Placeholder logic for number check
    }// end method 'checkInput'

    // method(overloading) 'checkInput' to check if the input is a string
    public static boolean checkInput(String input) {
        return true; // placeholder logic for string check
    }// end method 'checkInput'

    public static void main(String[] args) {
        // creating a 'Scanner' object to read user input
        Scanner scanner = new Scanner(System.in);

        // asking the user to enter something
        System.out.print("Enter something: ");

        // checking if the input is an integer
        if (scanner.hasNextInt()) {
            // If input is an integer
            int numberInput = scanner.nextInt();
            // calling the method 'checkInput' to check if the input is a number
            boolean isNumber = checkInput(numberInput);
            // displaying the result
            if (isNumber) {
                System.out.println("Your value is a number.");
            } else {
                System.out.println("Your value is not a string.");
            }// end ELSE
        } else {
            // if input is not an integer (considered as a string)
            String stringInput = scanner.next();
            // calling the method to check if the input is a string
            boolean isString = checkInput(stringInput);
            // displaying the result
            if (isString) {
                System.out.println("Your value is a string.");
            } else {
                System.out.println("Your value is not a number.");
            }// end ELSE
        }// end ELSE

        // closing the scanner object
        scanner.close();
        
    }// end method 'main'
    
}// end class 'UserInputProcessor'
