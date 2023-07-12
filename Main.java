// Superclass Shape
abstract class Shape {
    public abstract double calculateArea();
}

// Subclass Rectangle
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

// Subclass Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass Triangle
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Class ShapeCalculator
class ShapeCalculator {
    public void printArea(Shape shape) {
        double area = shape.calculateArea();
        System.out.println("The area of the shape is: " + area);
    }
}

// Main program
public class Main {
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();

        // Creating instances of Rectangle, Circle, and Triangle
        Rectangle rectangle = new Rectangle(5, 3);
        Circle circle = new Circle(4);
        Triangle triangle = new Triangle(6, 2);

        // Passing instances to the printArea() method
        calculator.printArea(rectangle);
        calculator.printArea(circle);
        calculator.printArea(triangle);
    }
}
