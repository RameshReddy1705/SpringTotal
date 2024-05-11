package com.udemy.LearnSpringFrameWork;

import com.udemy.LearnSpringFrameWork.game.GameRunner;
import com.udemy.LearnSpringFrameWork.game.MarioGame;
import com.udemy.LearnSpringFrameWork.game.PacMan;
import com.udemy.LearnSpringFrameWork.game.SuperContraGame;

public class AppGamingBasicsJava {

	public static void main(String[] args) {
		//var game=new MarioGame();
		//var game= new SuperContraGame();
		var game=new PacMan();
		var gameRunner= new GameRunner(game);
		gameRunner.run();
	}

}
