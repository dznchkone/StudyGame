package com.vavilinigor.studygame;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.vavilinigor.studygame.screens.GameScreen;


public class StudyGame extends Game {
	
	@Override
	public void create () {
		setScreen(new GameScreen());

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

	}
	
	@Override
	public void dispose () {

	}
}
