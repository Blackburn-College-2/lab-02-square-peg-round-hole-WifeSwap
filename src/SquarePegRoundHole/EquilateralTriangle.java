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
public class EquilateralTriangle extends Triangle{
    private Measurement side;
    public EquilateralTriangle(Measurement side){
        super(side,side,side);
        this.side=side;
    }
    @Override
    public Measurement getPerimeter() {
        Measurement Perimeter = new Measurement(side.getValue()*3,side.getUnit());
        return Perimeter;
    }
    @Override
    public Measurement getArea() {
        Measurement Area = new Measurement((Math.sqrt(3)/4)*Math.pow(side.getValue(),2),"square " + side.getUnit());
        return Area;
}
}
