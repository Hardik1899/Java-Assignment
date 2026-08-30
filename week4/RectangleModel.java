class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this(1.0);
    }

    public Rectangle(double side) {
        this(side, side);
    }

    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Dimensions must be positive.");
        }

        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean isSquare() {
        return width == height;
    }

    public void scale(double factor) {
        if (factor <= 0) {
            throw new IllegalArgumentException("Scale factor must be positive.");
        }

        width *= factor;
        height *= factor;
    }

    @Override
    public String toString() {
        return "Rectangle{width=" + width +
                ", height=" + height +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() + "}";
    }
}

public class RectangleModel {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(4, 6);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        System.out.println("r1 is square: " + r1.isSquare());
        System.out.println("r2 is square: " + r2.isSquare());
        System.out.println("r3 is square: " + r3.isSquare());

        r3.scale(2);

        System.out.println("After scaling r3:");
        System.out.println(r3);
    }
}