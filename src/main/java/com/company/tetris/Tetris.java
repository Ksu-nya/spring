package com.company.tetris;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.company.tetris.controller.GameInterface;

public class Tetris {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(TetrisConfig.class);
		GameInterface tetris = context.getBean(GameInterface.class);
		tetris.startGame();
	}
}
