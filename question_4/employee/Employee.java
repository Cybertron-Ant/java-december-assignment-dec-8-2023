package question_4.employee;


/* class 'Employee' extends class 'Person' and includes additional employee-related information, like an ID and job title, 
   while overriding a method to modify the last name retrieval to include the job title information */
class Employee extends Person {
    private int employeeId;
    private String jobTitle;

    // constructor 'Employee' to initialize Employee with first name, last name, employee ID, and job title
    public Employee(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }// end constructor 'Employee'

    // override the 'getLastName' getter method to include job title
    @Override
    public String getLastName() {
        return super.getLastName() + " (" + jobTitle + ")";
    }// end getter method 'getLastName'

    // getter method to get the employee ID
    public int getEmployeeId() {
        return employeeId;
    }// end getter method 'getEmployeeId'
    
}// end class 'Employee'
