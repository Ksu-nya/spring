package com.company.tetris.model;

import java.awt.event.KeyEvent;

import org.springframework.stereotype.Component;

import com.company.tetris.Constants;
import com.company.tetris.GameState;
import com.company.tetris.listener.OnFinishEvent;

@Component
public interface ModelInterface {
	
	public void timerTick();
	
	public int[][] getGameArea();
	
	public int getScoreValue();
	
	public Shape getCurrentFigure();

	public Shape getNextFigure();

	public GameState getCurrentState();

	public void setFinishEvent(OnFinishEvent event);
	
	public void onKeyPressed(KeyEvent e);
	
	public void startGame();
}
