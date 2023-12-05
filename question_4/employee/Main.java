package question_4.employee;

import java.util.Scanner;

/* class 'Main' demonstrating inheritance and polymorphism
   by creating instances of 'Person' and 'Employee' classes
   and showing their attributes and behaviors through method calls */
public class Main {
    public static void main(String[] args) {
        // 'Scanner' object to support user input
        Scanner scanner = new Scanner(System.in);

        // accept user input for a 'Person' object
        // to prove the 'Person' class works independently
        System.out.println("Enter first name for Person:");
        String personFirstName = scanner.next();
        System.out.println("Enter last name for Person:");
        String personLastName = scanner.next();
      
        // instanciate 'person' object, with first and last names as arguments
        Person person = new Person(personFirstName, personLastName);
        System.out.println("Person: " + person.getFirstName() + " " + person.getLastName());

        // accept user input for an 'Employee' object
        System.out.println("Enter first name for Employee:");
        String employeeFirstName = scanner.next();
        System.out.println("Enter last name for Employee:");
        String employeeLastName = scanner.next();
        System.out.println("Enter Employee ID:");
        int employeeId = scanner.nextInt();
        System.out.println("Enter Job Title:");
        String jobTitle = scanner.next();
      
        // instanciate 'Employee' object, with first name, last name, emp id, and job title as arguments
        Employee employee = new Employee(employeeFirstName, employeeLastName, employeeId, jobTitle);
        System.out.println("Employee: " + employee.getFirstName() + " " + employee.getLastName() +
                ", Employee ID: " + employee.getEmployeeId());

        scanner.close();
      
    }// end method 'main'
  
}// end class 'Main'
