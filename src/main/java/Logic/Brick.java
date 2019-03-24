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
public class Brick {
    
    private int height, onebrick, twobrick, fourbrick;
    
    public Brick() {
    }

    public Brick(int onebrick, int twobrick, int fourbrick) {
        this.onebrick = onebrick;
        this.twobrick = twobrick;
        this.fourbrick = fourbrick;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getOnebrick() {
        return onebrick;
    }

    public void setOnebrick(int onebrick) {
        this.onebrick = onebrick;
    }

    public int getTwobrick() {
        return twobrick;
    }

    public void setTwobrick(int twobrick) {
        this.twobrick = twobrick;
    }

    public int getFourbrick() {
        return fourbrick;
    }

    public void setFourbrick(int fourbrick) {
        this.fourbrick = fourbrick;
    }

    

    
}
