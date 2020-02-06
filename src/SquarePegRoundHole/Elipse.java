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
public class Elipse {

    private Measurement majorAxis;
    private Measurement minorAxis;

    public Elipse(Measurement majorAxis, Measurement minorAxis) {
        System.out.println("New Ellipse: " + majorAxis + " by " + minorAxis);
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    @Override
    public String toString() {
        return ("Elipse of " + majorAxis + " by " + minorAxis);
    }

    public Measurement getPerimeter() {
        Measurement perimeter = new Measurement(Math.PI*(3*(majorAxis.getValue()+minorAxis.getValue())-(Math.sqrt((3*majorAxis.getValue()+minorAxis.getValue())*(3*minorAxis.getValue()+majorAxis.getValue())))),majorAxis.getUnit());
    return perimeter;    
    }

    public Measurement getArea() {
        Measurement area = new Measurement(Math.PI * majorAxis.getValue() * minorAxis.getValue(), "square " + majorAxis.getUnit());
        return area;

    }
}
