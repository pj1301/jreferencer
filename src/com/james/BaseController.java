package com.james;

import com.james.controllers.AppManager;
import com.james.views.ViewFactory;

public abstract class BaseController {
   protected AppManager appManager;
   protected ViewFactory viewFactory;
   private String fxmlName;

   public BaseController(AppManager appManager, ViewFactory viewFactory, String fxmlName) {
      this.appManager = appManager;
      this.viewFactory = viewFactory;
      this.fxmlName = fxmlName;
   }

   public String getFxmlName() { return fxmlName;}
}
