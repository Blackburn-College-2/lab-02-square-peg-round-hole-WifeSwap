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
public class Measurement {
    private int value;
    private String unit;
    
    public Measurement(int value, String unit){
        this.value = value;
        this.unit = unit;
    }
    public int getValue(){
        return value;
    }
    
    @Override
    public String toString(){
        return (value + " " + unit);
    }
}
