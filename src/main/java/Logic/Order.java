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
    private int id;
    private int length;
    private int width;
    private int quantityheigth;
    private String orderdater;

    public Order(int id, int length, int width, int quantityheigth, String orderdater) {
        this.id = id;
        this.length = length;
        this.width = width;
        this.quantityheigth = quantityheigth;
        this.orderdater = orderdater;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getOrderdater() {
        return orderdater;
    }

    public void setOrderdater(String orderdater) {
        this.orderdater = orderdater;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", length=" + length + ", width=" + width + ", quantityheigth=" + quantityheigth + ", orderdater=" + orderdater + '}';
    }
    
    
}
