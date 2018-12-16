package com.company.tetris;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.company.tetris.controller.Game;
import com.company.tetris.controller.GameInterface;
import com.company.tetris.model.Model;
import com.company.tetris.model.ModelInterface;
import com.company.tetris.model.ShapeFactory;
import com.company.tetris.view.MainWindow;
import com.company.tetris.view.MainWindowInterface;

@Configuration
public class TetrisConfig {
	
	@Bean
	public MainWindowInterface mainWindow() {
		return new MainWindow();
	}
	
	@Bean
	public ModelInterface model() {
		return new Model();
	}
	
	@Bean
	public GameInterface game() {
		return new Game();
	}
	
	@Bean
	public ShapeFactory shapeFactory() {
		return new ShapeFactory();
	}
}
