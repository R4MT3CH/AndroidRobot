//Created by Ramin Roufeh
//android logo

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.scene.transform.Rotate; 

public class DrawShapes extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a circle and set its properties
	    
	  Circle circle3 = new Circle();
	    circle3.setCenterX(225);
	    circle3.setCenterY(150);
	    circle3.setRadius(75);
	    circle3.setFill(Color.GREEN);
	      
    Circle circle1 = new Circle();
    circle1.setCenterX(185);
    circle1.setCenterY(120);
    circle1.setRadius(6);
    circle1.setStrokeWidth(1.0);
    circle1.setFill(Color.BLACK);
    
    Circle circle2 = new Circle();
    circle2.setCenterX(260);
    circle2.setCenterY(120);
    circle2.setRadius(6);
    circle2.setStrokeWidth(1.0);
    circle2.setFill(Color.BLACK);
    
    Rectangle r0 = new Rectangle();
    r0.setX(150);
    r0.setY(150);
    r0.setWidth(150);
    r0.setHeight(10);
    r0.setFill(Color.BLACK);
    
    Rectangle r1 = new Rectangle();
    r1.setX(150);
    r1.setY(150);
    r1.setWidth(150);
    r1.setHeight(170);
    r1.setArcWidth(20);
    r1.setArcHeight(20);
    r1.setFill(Color.GREEN);
    
    Rectangle r2 = new Rectangle();
    r2.setX(310);
    r2.setY(160);
    r2.setWidth(30);
    r2.setHeight(100);
    r2.setArcWidth(30);
    r2.setArcHeight(30);
    r2.setFill(Color.GREEN);
    
    Rectangle r3 = new Rectangle();
    r3.setX(110);
    r3.setY(160);
    r3.setWidth(30);
    r3.setHeight(100);
    r3.setArcWidth(30);
    r3.setArcHeight(30);
    r3.setFill(Color.GREEN);
    
    Rectangle r4 = new Rectangle();
    r4.setX(250);
    r4.setY(275);
    r4.setWidth(30);
    r4.setHeight(100);
    r4.setArcWidth(30);
    r4.setArcHeight(30);
    r4.setFill(Color.GREEN);
    
    Rectangle r5 = new Rectangle();
    r5.setX(175);
    r5.setY(275);
    r5.setWidth(30);
    r5.setHeight(100);
    r5.setArcWidth(30);
    r5.setArcHeight(30);
    r5.setFill(Color.GREEN);
    
    Rectangle r6 = new Rectangle();
    r6.setX(260);
    r6.setY(60);
    r6.setWidth(10);
    r6.setHeight(40);
    r6.setArcWidth(10);
    r6.setArcHeight(10);
    r6.setFill(Color.GREEN);
    Rotate rotate = new Rotate(); 
    rotate.setAngle(30);
    rotate.setPivotX(260); 
    rotate.setPivotY(60);
    r6.getTransforms().addAll(rotate);
    
    Rectangle r7 = new Rectangle();
    r7.setX(180);
    r7.setY(60);
    r7.setWidth(10);
    r7.setHeight(40);
    r7.setArcWidth(10);
    r7.setArcHeight(10);
    r7.setFill(Color.GREEN);
    Rotate rotate1 = new Rotate(); 
    rotate1.setAngle(-30);
    rotate1.setPivotX(180); 
    rotate1.setPivotY(60);
    r7.getTransforms().addAll(rotate1);
    
    // Create a pane to hold the circle 
    Pane pane = new Pane();
    pane.getChildren().add(circle3);
    pane.getChildren().add(circle1);
    pane.getChildren().add(circle2);
    pane.getChildren().add(r1);
    pane.getChildren().add(r0);
    pane.getChildren().add(r2);
    pane.getChildren().add(r3);
    pane.getChildren().add(r4);
    pane.getChildren().add(r5);
    pane.getChildren().add(r6);
    pane.getChildren().add(r7);
        
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 450, 450);
    primaryStage.setTitle("ANDROID ROBOT"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    pane.setStyle("-fx-background-color: #000000");
    primaryStage.show(); // Display the stage
  }
  
  void DrawMyStuff(Pane myPane, Shape myShape)
  {
	  myPane.getChildren().add(myShape);
  }
  
  
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
  
  
}

