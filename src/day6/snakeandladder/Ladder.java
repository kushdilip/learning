package day6.snakeandladder;

public class Ladder {
	private Position top;
	private Position bottom;
	public Ladder(Position top, Position bottom) throws Exception {
		super();
		
		//Snake head position should be greater than tail position
		//Horizontal lying snake not allowed
		
//		int hValue = top.getPositionNumber();
//		int tValue = bottom.getPositionNumber();
//		if(hValue/10 > tValue/10 && !(hValue % 10 == 0) || (tValue % 10 == 0 && hValue - tValue > 0)){
//			properLadder = true;
//		}	
		boolean properLadder = top.isAbove(bottom);
		
		if (properLadder) {
			this.top = top;
			this.bottom = bottom;
		}
		else {
			throw new Exception("Invalid Ladder" + top.getPositionNumber()+ " "+ bottom.getPositionNumber());
		}
	}
	public Position getTop() {
		return top;
	}
	public Position getBottom() {
		return bottom;
	}

}
