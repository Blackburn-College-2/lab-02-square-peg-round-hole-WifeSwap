/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

/**
 *
 * @author paul.kline
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(5,7);
        Square square1 = new Square();
        Square square2 = new Square(5);
        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(square1);
        System.out.println(square2);*/
        Measurement height = new Measurement(10,"inches");
        Measurement width = new Measurement (2,"feet");
        Rectangle rectangle = new Rectangle(height,width);
        Square square = new Square(width);
    }
    
}
