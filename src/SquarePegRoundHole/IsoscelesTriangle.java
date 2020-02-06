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
public class IsoscelesTriangle extends Triangle{
    private Measurement doubledSide;
    private Measurement loneSide;
    public IsoscelesTriangle(Measurement doubledSide,Measurement loneSide){
        super(doubledSide,doubledSide,loneSide);
        this.doubledSide = doubledSide;
        this.loneSide = loneSide;
    }   
    

    @Override
    public Measurement getPerimeter() {
        Measurement Perimeter = new Measurement(((doubledSide.getValue()*2.0)+loneSide.getValue()),loneSide.getUnit());
        return Perimeter;
    }
    @Override
    public Measurement getArea() {
        Measurement Area = new Measurement(Math.sqrt(Math.pow(doubledSide.getValue(), 2)-Math.pow((loneSide.getValue()/2), 2)),"square " + loneSide.getUnit());
        return Area;
    }
}
