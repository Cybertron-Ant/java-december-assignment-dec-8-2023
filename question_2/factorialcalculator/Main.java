package question_2.factorialcalculator;


import java.util.Scanner;


/* class 'Main' calculates the factorial of a number inputted by the user */
public class Main {
    public static void main(String[] args) {
        
        // instanciate 'Scanner' object to take user input
        Scanner scanner = new Scanner(System.in);

        // ask user to enter a number
        System.out.print("Enter a number to calculate its factorial: ");
        int num = scanner.nextInt();

        // create an object of 'FactorialCalculator' class
        FactorialCalculator factorialObj = new FactorialCalculator(num);

        // calculate factorial using the 'calculateFactorial' method
        long result = factorialObj.calculateFactorial();

        // print the result
        System.out.println("Factorial of " + num + " is: " + result);

        scanner.close();
        
    }// end method 'main'
    
}// end class 'Main'
