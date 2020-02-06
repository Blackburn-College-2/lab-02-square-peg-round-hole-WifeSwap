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
public class Circle extends Elipse {

    private Measurement radius;

    public Circle(Measurement radius) {
        super(radius, radius);
        System.out.println("New Circle: " + radius);
        this.radius = radius;
    }

    @Override
    public Measurement getPerimeter() {
        Measurement perimeter = new Measurement(2.0*Math.PI*radius.getValue(),radius.getUnit());
        return perimeter;

    }

    @Override
    public Measurement getArea() {
        Measurement area = new Measurement(Math.PI*Math.pow(radius.getValue(),2),"square " + radius.getUnit());
        return area;
    }

    @Override
    public String toString() {
        return ("Circle of " + radius + " by " + radius);
    }
    public double getEfficiency(){
        return getArea().getValue()/getPerimeter().getValue();
    }
}
