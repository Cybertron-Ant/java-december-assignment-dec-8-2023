package question_6.shapeareaperimeter;

import java.util.Scanner;


/* class 'Main' shows the usage of abstract class 'Shape', 'Circle', and 'Triangle' classes using user input 
   to calculate and display the area and perimeter, respectively */
public class Main {
    public static void main(String[] args) {
        
        System.out.println("This app calculates the area and perimeter of a circle and triangle, respectively. ");
        
        Scanner scanner = new Scanner(System.in);
        
        // taking user input for circle's radius
        System.out.println("Enter radius of the circle: ");
        double circleRadius = scanner.nextDouble();
        Circle circle = new Circle(circleRadius);
        
        // taking user input for triangle's sides
        System.out.println("Enter 1st side of the triangle: ");
        double side1 = scanner.nextDouble();
        System.out.println("Enter 2nd side of the triangle: ");
        double side2 = scanner.nextDouble();
        System.out.println("Enter 3rd side of the triangle: ");
        double side3 = scanner.nextDouble();
        Triangle triangle = new Triangle(side1, side2, side3);
        
        // calculating and displaying area and perimeter for circle and triangle
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Perimeter of Circle: " + circle.calculatePerimeter());
        System.out.println("Area of Triangle: " + triangle.calculateArea());
        System.out.println("Perimeter of Triangle: " + triangle.calculatePerimeter());
        
        scanner.close();
        
    }// end method 'main'
    
}// end class 'Main'
