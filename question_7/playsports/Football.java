package question_7.playsports;

/* class 'Football', that implements the interface 'Playable', providing its specific implementation of the 'play()' method for class 'Football' */
class Football implements Playable {
    // method 'play' overriding the 'play' method in interface 'Playable', for class 'Football'
    @Override
    public void play() {
        System.out.println("Playing Football");
       
    }// end method 'play'
    
}// end class 'Football'
