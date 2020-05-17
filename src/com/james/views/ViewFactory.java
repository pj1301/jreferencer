package com.james.views;

import com.james.BaseController;
import com.james.controllers.AppManager;
import com.james.controllers.MainController;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.*;
import com.james.exception.ExceptionHandler;

public class ViewFactory {
   private AppManager appManager;

   public ViewFactory(AppManager appManager) { this.appManager = appManager; }

   public void showMain() {
      BaseController controller = new MainController(appManager, this, "main.fxml");
      displayNewStage(controller, "jReferencer");
   }

   public void closeOldStage(Stage stage) {
      stage.close();
   }

   private void displayNewStage(BaseController controller) {
      FXMLLoader loader = new FXMLLoader(getClass().getResource(controller.getFxmlName()));
      loader.setController(controller);
      Parent root;
      try {
         root = loader.load();
      } catch(Exception e) {
         ExceptionHandler.handle(e);
         return;
      }
      Stage stage = new Stage();
      Scene scene = new Scene(root);
      scene.getStylesheets().add("Styles.css");
      stage.setScene(scene);
      stage.show();
   }

   private void displayNewStage(BaseController controller, String windowName) {
      FXMLLoader loader = new FXMLLoader(getClass().getResource(controller.getFxmlName()));
      loader.setController(controller);
      Parent root;
      try {
         root = loader.load();
      } catch(Exception e) {
         ExceptionHandler.handle(e);
         return;
      }
      Stage stage = new Stage();
      Scene scene = new Scene(root);
      scene.getStylesheets().add("Styles.css");
      stage.setTitle(windowName);
      stage.setScene(scene);
      stage.show();
   }
}
