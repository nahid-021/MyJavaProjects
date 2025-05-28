/* Create a Shape class with a method area(). Make Rectangle and Circle classes that inherit Shape 
and calculate their respective areas. */
class Shape {
    double area() {
        return 0;
    }
}
class Rectangle extends Shape {
    double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    double area() {
        return length*width;
    }
}
class Circle extends Shape {
    double r;
    Circle(double r) {
        this.r = r;
    }
    @Override
    double area() {
        return Math.PI*r*r;
    }
}
public class Inheritance_shape {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(7,8);
        System.out.println("Rectangle area: " + rectangle.area());
        Circle circle = new Circle(2);
        System.out.println("circle area: " + circle.area());
    }
}