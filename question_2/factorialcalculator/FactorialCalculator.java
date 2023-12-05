package question_2.factorialcalculator;

//  class 'factorialCalculator' to calculate factorial of a number using a 'for' loop
class FactorialCalculator {
    private int number; // variable to store the number

    // constructor 'FactorialCalculator' to initialize the number
    public FactorialCalculator(int num) {
        number = num;
    }// end constructor 'FactorialCalculator'

    // method 'calculateFactorial' to calculate factorial
    public long calculateFactorial() {
        long factorial = 1;

        // iterates from 1 up to the given number (number) and multiplies each number in sequence to get the factorial
        /* for instance, if number is 5, the loop would perform the following calculations:
           factorial *= 1; (initial value of factorial is 1)
           factorial *= 2; (factorial = 1 * 2 = 2)
           factorial *= 3; (factorial = 2 * 3 = 6)
           factorial *= 4; (factorial = 6 * 4 = 24)
           factorial *= 5; (factorial = 24 * 5 = 120)  */
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }// end FOR

        return factorial;
        
    }// end method 'calculateFactorial'
    
}// end class 'FactorialCalculator'
