package ocp1;

import ocp1.shape.Shape;
import ocp1.shape.impl.Rectangle;
import ocp1.shape.impl.RightTriangle;
import ocp1.shape.impl.Square;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new RightTriangle(2, 3));
        shapes.add(new Square(4));
        shapes.add(new Rectangle(2, 3));
        double sumArea = 0;
        for (Shape shape : shapes) {
            sumArea += shape.area();
        }

        System.out.printf("Sum of areas equals %f \n", sumArea);
    }
}
