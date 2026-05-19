//Parent class
class Shape{

//Method for Area
    double calculateArea(){
    return 0;
    }
}

//1st child class
class Circle extends Shape{
    double radius;

//Parameterized constructor for radius
    Circle(double radius){
        this.radius=radius;

    }

//Method overriding
    double calculateArea(){
    return Math.PI*radius*radius;
    }
}

//2nd child class
class Square extends Shape{
    double side;

//Parameterised constructor for square
    Square(double side){
        this.side=side;
    }

//Method ovveriding
    double calculateArea(){
        return side*side;
    }
}

//Main function
public class Shapes2{
    public static void main(){

    //Polymorphism
    Shape c= new Circle(5);
    Shape s=new Square(4);

    System.out.printf("Area of the Circle = %.1f\n",c.calculateArea());
    System.out.println("Area of the Square = "+s.calculateArea());
    }
}
//EXPECTED OUTPUT
// Sample Output (Reference)
// Area of Circle: 78.5
// Area of Square: 16.0
