package zero_module.ZeroExterminationQuest;
// author - Antonio Fuller
import java.util.Scanner;

public class ZeroExterminationQuest {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Zero Extermination Quest!");
        System.out.println("Please input the string with zeros to be exterminated: ");
        
        // take input
        String inputString = scanner.nextLine();
        scanner.close();
        
        String outputString = killZeros(inputString);
        
        System.out.println("\n" + "\n" + "The fearless adventurer has returned victorious! Behold, the purified string: ");
        
        System.out.println(outputString);
        
        System.out.println("\n" + "\n" + "Congratulations on completing the Zero Extermination Quest!" + "\n" + "\n");
        
    }// end 'main' method
    
    public static String killZeros(String input) {
        
        // Prepare your swords, shields, and spells for the epic battle!
        StringBuilder purifiedString = new StringBuilder();
        
        // go through each character in the string
        for (char character : input.toCharArray()) {
            
            // check if the character is not a zero
            if (character != '0') {
                
                // Hurray! The adventurer triumphs over the evil zero!
                purifiedString.append(character);
                
            } else {
                
                // another zero discovered, but fear not, our hero shall prevail!
                System.out.println("\n" + "\n" + "The adventurer has killed a zero!");
                
            }// end ELSE
            
        }// end FOR
        
        // the adventure concludes, returning the purified string as the treasure!
        return purifiedString.toString();
        
    }// end 'killZeros' method
    
}// end 'ZeroExterminationQuest' class

