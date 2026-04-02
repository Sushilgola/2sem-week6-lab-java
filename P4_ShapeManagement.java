/**
 * Problem 4: Shape Management
 * You need to develop a module for a graphics application that manages
 * different
 * shapes using an interface. Implement classes for shapes (e.g., Circle,
 * Rectangle,
 * Triangle) and use an interface for common methods like draw() and getArea().
 */

// Create the shape interface
interface Shape {
    void draw();

    double getArea();
}

// Implement Circle class using Shape
class Circle implements Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle...");
    }
}

// Implement Rectangle class using Shape
class Rectangle implements Shape {
    private double length;
    private double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double getArea() {
        return length * breadth;
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle...");
    }
}

// Implement Triangle class using Shape
class Triangle implements Shape {
    private double base;
    private double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing triangle...");
    }
}

// Public class
public class P4_ShapeManagement {
    public static void main(String[] args) {
        Circle c = new Circle(5.5);
        c.draw();
        System.out.println("Area: " + c.getArea());

        System.out.println();

        Rectangle r = new Rectangle(2.5, 3);
        r.draw();
        System.out.println("Area: " + r.getArea());

        System.out.println();

        Triangle t = new Triangle(10, 4.5);
        t.draw();
        System.out.println("Area: " + t.getArea());

        System.out.println();
    }
}
