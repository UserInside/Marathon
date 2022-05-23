package day9.Task2;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double area() {
        return Math.pow(radius, 2) * Math.PI ;
    }

    public double perimeter() {
        return Math.PI * radius * 2;
    }
}
