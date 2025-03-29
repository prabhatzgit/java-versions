package jdk17.sealedclasses.pkg1;

// case1
//public class ShapeSealedClassImpl {
//}
public abstract sealed class ShapeSealedClassImpl extends Thread permits Circle, Rectangle {

    public abstract void draw();
}

final class Circle extends ShapeSealedClassImpl {

    @Override
    public void draw() {

    }
}
 non-sealed class Rectangle extends ShapeSealedClassImpl {

    @Override
    public void draw() {

    }
}

class Test extends Rectangle{

}

// irrelevant
//class Car extends ShapeSealedClassImpl {
//
//    @Override
//    public void draw() {
//
//    }
//}

// sealed is required to restrict a particular class
// permit and extend can use at a time