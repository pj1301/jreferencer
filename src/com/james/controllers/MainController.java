package com.james.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MainController {

   @FXML
   public Button openBtn;

   @FXML
   void openProject() {
      System.out.println("Hey there opening project");
   }
}