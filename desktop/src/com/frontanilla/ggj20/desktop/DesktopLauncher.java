package com.frontanilla.ggj20.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.frontanilla.ggj20.SpaceshipGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.width = 1100;
		config.height = 550;

		new LwjglApplication(new SpaceshipGame(), config);
	}
}
