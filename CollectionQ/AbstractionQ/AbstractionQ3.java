/*
3.Abstract + Concrete Fields
Create abstract class Shape with:
concrete field: type = "Shape"
abstract method: area()
Implement Circle and Rectangle, then compute areas in a list.
 */


import java.util.ArrayList;
import java.util.List;

abstract class Shape{

    String type = "shape";

    abstract double area();
}
class Circle extends Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.type = "Circle";
    }

    public double area(){
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
        this.type = "Rectangle";
    }

    public double area(){
        return length * breadth ;
    }
}

public class AbstractionQ3 {
    public static void main(String[] args){

        List<Shape> shape = new ArrayList<>();

        shape.add(new Circle(12));
        shape.add(new Rectangle(12,10));

        for (Shape s : shape){
            System.out.println(s.type + " Area :" + s.area());
        }
    }
}
