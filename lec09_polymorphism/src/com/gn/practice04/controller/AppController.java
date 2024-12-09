package com.gn.practice04.controller;

import com.gn.practice04.model.vo.AppFeatures;
import com.gn.practice04.model.vo.LoginMenu;

public class AppController {

	public void startMyApp() {
		AppFeatures app = new LoginMenu();
		
		app.display();
		app.input();
		app.close();
	}
}
