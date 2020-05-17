package com.james.controllers;

import com.james.BaseController;
import com.james.exception.ExceptionHandler;
import com.james.views.ViewFactory;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.net.URL;

public class MainController extends BaseController {

   public MainController(AppManager appManager, ViewFactory viewFactory, String fxmlName) {
      super(appManager, viewFactory, fxmlName);
   }

   @FXML
   public Button openBtn;

   @FXML
   public AnchorPane rootElement;

   @FXML
   public TabPane tabPane;


   @FXML
   void openProject() {
      try {
         createTab();
      } catch(Exception e) {
         ExceptionHandler.handle(e);
      }
   }

   private void createTab() throws Exception {
      URL url = new File("src/com/james/views/tabContent.fxml").toURI().toURL();
      FXMLLoader loader = new FXMLLoader(url);
      // below will be needed when AbstractController is implemented
      // loader.setController(new TabContentController());
      Parent tabContent = loader.load();
      Tab tab = new Tab("New Tab");
      tab.setContent(tabContent);
      tabPane.getTabs().add(tab);
   }

}