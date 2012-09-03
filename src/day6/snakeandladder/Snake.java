package day6.snakeandladder;

public class Snake {
	private Position head;
	private Position tail;

	public Snake(Position head, Position tail) throws Exception {
		super();
		
		//Snake head position should be greater than tail position
		//Horizontal lying snake not allowed
//		boolean properSnake = false;
//		int hValue = head.getPositionNumber();
//		int tValue = tail.getPositionNumber();
//		if(hValue/10 > tValue/10 && !(hValue % 10 == 0) || (tValue % 10 == 0 && hValue - tValue > 0)){
//			properSnake = true;
//		}			
		
		
		boolean properSnake = head.isAbove(tail);
		
		if (properSnake) {
			this.head = head;
			this.tail = tail;
		}
		else {
			throw new Exception("Invalid snake"+ head.getPositionNumber()+" "+ tail.getPositionNumber());
		}
	}

	public Position getHead() {
		return head;
	}

	public Position getTail() {
		return tail;
	}
}
