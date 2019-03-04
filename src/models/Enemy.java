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
public class Enemy extends Movable implements Runnable {

    public Enemy(int xPos, int yPos, Image sprite) {
        super(xPos, yPos, sprite);
    }

    @Override
    public void run() {
        System.out.println("topkek");
    }
    
    
}
