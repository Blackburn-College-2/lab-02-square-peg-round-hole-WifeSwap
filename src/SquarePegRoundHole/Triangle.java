/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SquarePegRoundHole;

/**
 *
 * @author Gabl
 */
public class Triangle {

    private Measurement side1;
    private Measurement side2;
    private Measurement side3;

    public Triangle(Measurement side1, Measurement side2, Measurement side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Measurement getPerimeter() {
        Measurement Perimeter = new Measurement((side1.getValue()+side2.getValue()+side3.getValue()),side1.getUnit());
        return Perimeter;
    }
    public Measurement getArea() {
        Measurement Area = new Measurement(Math.sqrt(getPerimeter().getValue()/2*(getPerimeter().getValue()/2-side1.getValue())*(getPerimeter().getValue()/2-side2.getValue())*(getPerimeter().getValue()/2-side3.getValue())),side1.getUnit());
        return Area;
    }
}
