/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SquarePegRoundHole;

/**
 *
 * @author jonathan.gabl
 */
public class Square extends Rectangle {

    private Measurement side;

    public Square(Measurement side) {
        super(side, side);
        this.side = side;
        System.out.println("New Square: " + side);
    }

    @Override
    public String toString() {
        return ("Square of " + side);
    }

    public Measurement getPerimeter() {
        Measurement perimeter = new Measurement(4*side.getValue(),side.getUnit());
        return perimeter;

    }

    public Measurement getArea() {
        Measurement area = new Measurement(Math.pow(side.getValue(), 2), "square " + side.getUnit());
        return area;
    }
}
