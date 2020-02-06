/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SquarePegRoundHole;

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
        
        Measurement height = new Measurement(3,"inches");
        Measurement width = new Measurement (6,"inches");
        Measurement side3 = new Measurement (5, "inches");
        Rectangle rectangle1 = new Rectangle(height,width);
        Rectangle rectangle2 = new Rectangle(width,height);
        Square square1 = new Square(height);
        Square square2 = new Square(width);
        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(square1);
        System.out.println(square2);
        Elipse elipse1= new Elipse(height, width);        
        Elipse elipse2= new Elipse(width, height);
        Circle circle1= new Circle(height);
        Circle circle2= new Circle(width);
        System.out.println(elipse1);
        System.out.println(elipse2);
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.getArea());
        System.out.println(elipse1.getPerimeter());
        Triangle triangle = new Triangle(height,width,side3);
        System.out.println(triangle.getArea());
        IsoscelesTriangle triangle1 = new IsoscelesTriangle(side3,width);
        System.out.println(triangle1.getArea());
    }
    
}
