/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javafx.scene.image.Image;

/**
 *
 * @author Gloria
 */
public abstract class Movable extends Thread {
    protected int xPos;
    protected int yPos;
    protected Image sprite;

    public Movable(int xPos, int yPos, Image sprite) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.sprite = sprite;
    }

    

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }
    
    public void moveRight(){
        this.xPos += 15;
    }
    
    public void moveLeft(){
            this.xPos -= 15;
    }
    
    public void jump(){
        this.yPos -= 5;
    }

    public Image getSprite() {
        return sprite;
    }

    public void setSprite(Image sprite) {
        this.sprite = sprite;
    }
    
    
}

