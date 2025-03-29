package jdk17.sealedclasses.withoutsealed;

interface Shape {
    double area();
}

class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
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

class Triangle implements Shape {
    private final double width;
    private final double height;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

public class WithoutSealedClassesExample {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 3);

        System.out.println("Circle area: " + circle.area());
        System.out.println("Rectangle area: " + rectangle.area());
    }
}
// Other classes can also implement Shape