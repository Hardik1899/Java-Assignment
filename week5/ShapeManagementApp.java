public class ShapeManagementApp {

    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle("Red", 5),
                new Rectangle("Blue", 4, 6),
                new Triangle("Green", 3, 5),
                new Circle("Yellow", 3),
                new Rectangle("Black", 7, 2)
        };

        double totalArea = 0;

        System.out.println("------ SHAPE MANAGEMENT APP ------");

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println();

            totalArea += shape.getArea();
        }

        double averageArea = totalArea / shapes.length;

        System.out.println("Total Area: " + totalArea);
        System.out.println("Average Area: " + averageArea);

        Shape largest = shapes[0];

        for (Shape shape : shapes) {
            if (shape.getArea() > largest.getArea()) {
                largest = shape;
            }
        }

        System.out.println("Largest Shape: " + largest);
        System.out.println("Largest Area: " + largest.getArea());
    }
}


abstract class Shape {

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape color: " + color;
    }
}


class Circle extends Shape {

    private double radius;

    public Circle(String color, double radius) {
        super(color);

        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }

        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle - Color: " + getColor() + ", Radius: " + radius;
    }
}


class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);

        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Length and width must be positive");
        }

        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle - Color: " + getColor()
                + ", Length: " + length
                + ", Width: " + width;
    }
}


class Triangle extends Shape {

    private double base;
    private double height;

    public Triangle(String color, double base, double height) {
        super(color);

        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Base and height must be positive");
        }

        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public double getPerimeter() {
        // Assuming an equilateral triangle for simple perimeter calculation
        return 3 * base;
    }

    @Override
    public String toString() {
        return "Triangle - Color: " + getColor()
                + ", Base: " + base
                + ", Height: " + height;
    }
}
