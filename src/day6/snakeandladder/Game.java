package day6.snakeandladder;

import java.util.HashMap;

public class Game {
	Board board;
	HashMap<Player, Integer> players;
	/**
	 * @param board
	 * @param players
	 * @throws Exception 
	 */
	public Game(String[] playerNames) throws Exception {
		super();
		this.board = Board.getInstance();
		for (int i = 0; i < playerNames.length; i++) {
			players.put(new Player(new Position(0), playerNames[i]), 0);
		}
		
	}
	
}
