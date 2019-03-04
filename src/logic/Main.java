/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gloria
 */

package logic;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import logic.*;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane layout = new Pane();
        Canvas canvas = new Canvas(800, 512);
        layout.getChildren().add(canvas);
        
        Scene scene = new Scene(layout, canvas.getWidth(), canvas.getHeight());
        GraphicsContext pencil = canvas.getGraphicsContext2D();
        Loop player = new Loop(scene, pencil);
        player.start();
        
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
