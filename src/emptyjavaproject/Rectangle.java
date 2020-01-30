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

    @Override
    public String toString() {
        return ("Rectangle of " + width + " by " + height);
    }

}
