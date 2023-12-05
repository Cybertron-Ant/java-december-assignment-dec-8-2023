package question_4.employee;


/* class 'Person' that encapsulates a basic person's first and last names through a constructor and provides methods to retrieve these names individually */
class Person {
    private String firstName;
    private String lastName;

    // constructor 'Person' to initialize first and last names
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }// end constructor 'Person'

    // getter method to get the first name of the person
    public String getFirstName() {
        return firstName;
    }// end method 'getFirstName'

    // getter method to get the last name of the person
    public String getLastName() {
        return lastName;
    }// end method 'getLastName'
    
}// end class 'Person'
