package question_6.shapeareaperimeter;


/* class 'Circle' extends an abstract 'Shape' class, implementing methods to calculate the area and perimeter specifically for circles */
class Circle extends Shape {
    private double radius;
    
    // constructor 'Circle' to initialize the radius of the circle
    public Circle(double radius) {
        this.radius = radius;
    }// end constructor 'Circle'
    
    // method 'calculateArea' to calculate the area of the circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }// end method 'calculateArea'
    
    // method 'calculatePerimeter' to calculate the perimeter of the circle
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }// end method 'calculatePerimeter'
    
}// end class 'Circle'
