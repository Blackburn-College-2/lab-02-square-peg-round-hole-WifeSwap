/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

/**
 *
 * @author jonathan.gabl
 */
public class Square extends Rectangle {

    private double side;

    public Square(Measurement side) {
        super(side, side);
        this.side = side.getValue();
        System.out.println("New Square: " + side);
    }

    @Override
    public String toString() {
        return ("Square of " + side);
    }
}
