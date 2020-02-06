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
public class Rectangle {

    private Measurement height;
    private Measurement width;

    public Rectangle(Measurement h, Measurement w) {
        height = h;
        width = w;
        System.out.println("New rectangle: " + width + " by " + height);
    }

    public String getWidth() {
        return width.toString();
    }

    public String getHeight() {
        return height.toString();
    }
    
    public double getEfficiency(){
        return getArea().getValue()/getPerimeter().getValue();
    }
    public Measurement getPerimeter() {
        Measurement perimeter = new Measurement((2.0*height.getValue())+(2.0*width.getValue()),height.getUnit());
        return perimeter;

    }
    public Measurement getArea() {
        Measurement area = new Measurement(height.getValue()*width.getValue(),"square " + height.getUnit());
        return area;
    }

    @Override
    public String toString() {
        return ("Rectangle of " + width + " by " + height);
    }

}
