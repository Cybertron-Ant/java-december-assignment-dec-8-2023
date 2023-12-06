package question_6.shapeareaperimeter;


/* abstract class 'Shape', defining methods for calculating the area and perimeter 
   which will be implemented by its subclasses for specific shapes */
abstract class Shape {
    // abstract method to calculate area (to be implemented by subclasses)
    public abstract double calculateArea();
    
    // abstract method to calculate perimeter (to be implemented by subclasses)
    public abstract double calculatePerimeter();
    
}// end abstract class 'Shape'
