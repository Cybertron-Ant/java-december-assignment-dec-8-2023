package question_6.shapeareaperimeter;


/* class 'Triangle' inheriting from abstract class 'Shape' to calculate the area and perimeter of a triangle using its side lengths, 
   implementing methods specific to triangles */
class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;
    
    // constructor 'Triangle' to initialize three sides of a triangle
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }// end constructor 'Triangle'
    
    // method 'calculateArea' to find the area of the triangle
    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }// end method 'calculateArea'
    
    // method 'calculatePerimeter' to calculate the perimeter of the triangle
    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }// end method 'calculatePerimeter'
    
}// end class 'Triangle'
