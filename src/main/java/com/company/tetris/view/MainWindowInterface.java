package com.company.tetris.view;

import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

import org.springframework.stereotype.Component;

import com.company.tetris.Constants;
import com.company.tetris.model.Shape;

@Component
public interface MainWindowInterface {

	public void onFinishGame();

	public void init(KeyListener keyListener, ActionListener windowButtonsListener);

	public void draw(int[][] gameArea, int scoreValue, Shape currentFigure, Shape nextFigure);
}
