package com.james;

import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class Main extends Application {

   @Override
   public void start(Stage primaryStage) throws Exception {
      Parent root = FXMLLoader.load(getClass().getResource("views/main.fxml"));
      primaryStage.setTitle("jReferencer");
      Scene scene = new Scene(root, 600, 400);
      scene.getStylesheets().add("Styles.css");
      primaryStage.setScene(scene);
      primaryStage.show();
   }

   public static void main(String[] args) { launch(args); }
}