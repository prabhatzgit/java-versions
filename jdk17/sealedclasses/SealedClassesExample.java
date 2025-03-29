package jdk17.sealedclasses;

sealed interface Shape {
    double area();
}

final class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

final class Rectangle implements Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

final class Triangle implements Shape {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

public class SealedClassesExample {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 3);
        Shape triangle = new Triangle(6, 4);
        //Shape square = new Square();
        System.out.println("Circle area: " + circle.area());
        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Triangle area: " + triangle.area());

        // Attempt to create an invalid subclass (won't compile)
        // Shape invalidShape = new InvalidShape();
    }
}