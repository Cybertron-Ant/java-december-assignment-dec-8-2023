package question_1.findsumandaverage;

import java.util.Scanner;

/* class 'FindSumAndAverage' takes five numbers as input from the user, 
   calculates their sum and average, and then displays these computed values to the user */
public class FindSumAndAverage {
    public static void main(String[] args) {
        // initialize a 'Scanner' object to read input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input exactly 5 numbers separated by spaces: ");

        // read the input line containing five numbers
        String input = scanner.nextLine();

        // split the input string by spaces to get individual numbers
        String[] numbers = input.split(" ");

        // check if exactly five numbers are provided
        if (numbers.length != 5) {
            System.out.println("Please input exactly 5 numbers separated by spaces.");
        } else {
            // initialize variables for sum and average
            int sum = 0;
            double average = 0.0;

            // calculate sum of the numbers
            for (String number : numbers) {
                // convert each number from string to integer and add to sum
                sum += Integer.parseInt(number);
            }// end FOR

            // calculate average
            average = (double) sum / numbers.length;

            // print the sum and average
            System.out.println("The sum of 5 numbers is: " + sum);
            System.out.println("The Average is: " + average);
        }// end ELSE

        // close the scanner
        scanner.close();
        
    }// end method 'main'
    
}// end class 'FindSumAndAverage'
