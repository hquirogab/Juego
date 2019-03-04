/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;
import java.util.ArrayList;
import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import models.*;

/**
 *
 * @author Gloria
 */
public class Loop extends AnimationTimer {
    private Scene scene;
    private GraphicsContext pencil;
    private Image placeholder;
    private ArrayList<String> keyPresses = null;
    private Player player;
    private Background bg;
    private int frames;
    
    public Loop(Scene scene, GraphicsContext pencil) {
        this.scene = scene;
        this.pencil = pencil;
        this.player = new Player(400, 367, new Image("image/down1.png"));
        this.bg = new Background(0, 0, new Image("image/fondo.png"));
        this.keyPresses = new ArrayList<>();
        
        
        scene.setOnKeyPressed(
            new EventHandler<KeyEvent>() {
                public void handle(KeyEvent event) {
                    String code = event.getCode().toString();
                    if(!keyPresses.contains(code)){
                        keyPresses.add(code);
                    }
                };       
            }
        );
    
        scene.setOnKeyReleased(
                new EventHandler<KeyEvent>(){
                    @Override
                    public void handle(KeyEvent event){
                        String code = event.getCode().toString();
                        if(keyPresses.contains(code)){
                            keyPresses.remove(code);
                            player.reset();
                        }
                    }
                }
        );   
    }

    @Override
    public void handle(long now){
        if(frames % 3 == 0){
            pencil.clearRect(0, 0, 2000, 2000);
            pencil.drawImage(bg.getSprite(), bg.getxPos(), bg.getyPos());
            pencil.drawImage(player.getSprite(), player.getxPos(), player.getyPos());


            if (keyPresses.contains("RIGHT")){
                bg.moveLeft();//bg se mueve invertido
                player.moveRight();
            }
            if (keyPresses.contains("LEFT")){
                bg.moveRight();//bg se mueve invertido
                player.moveLeft();
            }
            if (keyPresses.contains("UP")){
                player.jump();
            }
        }
        frames++;
        if(frames == 5) frames = 0;
    }
}
