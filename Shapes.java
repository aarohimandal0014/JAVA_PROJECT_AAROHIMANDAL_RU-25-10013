//1st class for Circle
class Circle{
    double radius;

//parameterized constructor for radius
    Circle(double radius){
        this.radius=radius;
    }

//Method to calculate area of circle
    double calculateArea(){
        return Math.PI * radius * radius;
    }
}
//2nd class for Square
class Square{
    double side;

//parametarized constructor for square
    Square(double side){
        this.side=side;
    }

//Method to calculate area of square
    double calculateArea(){
        return side * side;
    }
}

//Main Function(Shapes)
public class Shapes{
    public static void main (String[] args){
        Circle c =new Circle(5);
        Square s =new Square(4);

        System.out.println("Area of Circle = "+ c.calculateArea());
        System.out.println("Area of Square = "+ s.calculateArea());

    }
}
//EXPECTED OUTPUT
// Sample Output (Reference)
// Area of Circle: 78.5
// Area of Square: 16.0


