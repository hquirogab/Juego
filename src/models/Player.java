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
public class Player extends Movable {
    private Image right = new Image("image/right0.png");
    private Image left = new Image("image/left0.png");
    private Image front = new Image("image/down1.png");

    public Player(int xPos, int yPos, Image sprite) {
        super(xPos, yPos, sprite);
    }

    
    @Override
    public void moveLeft(){
        sprite = left;
    }
    
    @Override
    public void moveRight(){
        sprite = right;
    }
    
    public void reset(){
        sprite = front;
    }

    @Override
    public void run() {
        System.out.println("kek");
    }
}
