package question_7.playsports;

/* class 'Main' to test the implemented classes ('Football', 'Volleyball', and 'Basketball') 
   adhering to the interface 'Playable', each class showing their own implementations for the 'play()' method, 
   representing the act of playing each specific sport */
public class Main {
    public static void main(String[] args) {
        
        // create instances of the sports
        Football football = new Football();
        Volleyball volleyball = new Volleyball();
        Basketball basketball = new Basketball();

        // call play method for each sport
        football.play();
        volleyball.play();
        basketball.play();
        
    }// end method 'main'
    
}// end class 'Main'
