package ocp1.shape.impl;

import ocp1.shape.Shape;

public class RightTriangle implements Shape {
    private final int leg1;
    private final int leg2;
    private final double hypotenuse;

    public RightTriangle(int leg1, int leg2) {
        this.leg1 = leg1;
        this.leg2 = leg2;
        this.hypotenuse = Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2));
    }

    public int getLeg2() {
        return leg2;
    }

    public int getLeg1() {
        return leg1;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    @Override
    public double area() {
        return leg1 * leg2 / 2.0;
    }
}
