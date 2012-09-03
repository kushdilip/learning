package day6.snakeandladder;

public class Player {
	private Position currentPosition;
	private String name;
	
	/**
	 * @param currentPosition
	 */
	public Player(Position currentPosition, String playeName) {
		super();
		this.currentPosition = currentPosition;
		this.name = playeName;
	}

	/**
	 * @throws Exception 
	 * 
	 */
	public Player() throws Exception {
		super();
		currentPosition = new Position(0);
	}
	
	public Position getCurrentPosition() {
		return currentPosition;
	}
	
	
	public Position move(Position toMovePosition) {
		currentPosition = toMovePosition;
		return currentPosition;
	}

	public String getName() {
		return name;
	}
	
	
	
	
}
