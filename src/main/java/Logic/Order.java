/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author benjaminbajrami
 */
public class Order {
    
    private int length;
    private int width;
    private int quantityheigth;
    

    public Order( int length, int width, int quantityheigth) {
        
        this.length = length;
        this.width = width;
        this.quantityheigth = quantityheigth;
        
    }

    

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getQuantityheigth() {
        return quantityheigth;
    }

    public void setQuantityheigth(int quantityheigth) {
        this.quantityheigth = quantityheigth;
    }

    @Override
    public String toString() {
        return "Order{" + "length=" + length + ", width=" + width + ", quantityheigth=" + quantityheigth + '}';
    }

    

    
    
    
}
