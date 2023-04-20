package advancedjava;
class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }
}

class Rectangle extends Shape {
    protected double width;
    protected double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

class Circle extends Shape {
    protected double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
    protected double side1;
    protected double side2;
    protected double side3;

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}

public class que10 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle("red", 5, 10);
        System.out.println("Rectangle:");
        System.out.println("  Color: " + rect.getColor());
        System.out.println("  Width: " + rect.getWidth());
        System.out.println("  Height: " + rect.getHeight());
        System.out.println("  Area: " + rect.getArea());
        System.out.println("  Perimeter: " + rect.getPerimeter());

        Circle circle = new Circle("blue", 7);
        System.out.println("Circle:");
        System.out.println("  Color: " + circle.getColor());
        System.out.println("  Radius: " + circle.getRadius());
        System.out.println("  Area: " + circle.getArea());
        System.out.println("  Perimeter: " + circle.getPerimeter());

        Triangle triangle = new Triangle("green", 3, 4, 5);
        System.out.println("Triangle:");
        System.out.println("  Color: " + triangle.getColor());
        System.out.println("  Side 1: " + triangle.getSide1());
        System.out.println("  Side 2: " + triangle.getSide2());
        System.out.println("  Side 3: " + triangle.getSide3());
        System.out.println("  Area: " + triangle.getArea());
        System.out.println("  Perimeter: " + triangle.getPerimeter());
    }}
