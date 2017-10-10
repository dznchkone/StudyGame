package com.vavilinigor.studygame;


import com.badlogic.gdx.Game;
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.graphics.GL20;
import com.vavilinigor.studygame.screens.GameScreen;


public class StudyGame extends Game {
	
	@Override
	public void create () {
		setScreen(new GameScreen());

	}
}
