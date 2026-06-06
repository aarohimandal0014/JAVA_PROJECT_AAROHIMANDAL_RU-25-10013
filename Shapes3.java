// Shape Interface
interface Shape {
    double calculateArea();
}

// Circle Class
class Circle implements Shape {
    double radius;

    // Parameterized Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Implementing interface method
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Square Class
class Square implements Shape {
    double side;

    // Parameterized Constructor
    Square(double side) {
        this.side = side;
    }

    // Implementing interface method
    public double calculateArea() {
        return side * side;
    }
}

// Main Class
public class Shapes3 {
    public static void main(String[] args) {

        // Polymorphism using interface reference
        Shape s1 = new Circle(5);
        Shape s2 = new Square(4);

        System.out.printf("Area of Circle: %.1f%n", s1.calculateArea());
        System.out.printf("Area of Square: %.1f%n", s2.calculateArea());
    }
}