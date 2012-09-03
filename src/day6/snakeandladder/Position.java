package day6.snakeandladder;

public class Position {
	private int positionNumber = 0;
	
	public Position(int positionNumber) throws Exception{
		//Only position in range [0,100] allowed
		if (positionNumber >= 0 && positionNumber <= 100) {
			this.positionNumber = positionNumber;
		}
		else {
			throw new Exception("Out of range positions");
		}
	}

	public int getPositionNumber() {
		return positionNumber;
	}
	
	public boolean isAbove(Position obj) {
		int objRowNum = getRowNumber(obj);
		int ourRowNum = getRowNumber(this);
		
		return ourRowNum > objRowNum;
	}

	private int getRowNumber(Position obj) {
		int objRowNum = (obj.getPositionNumber() -1 )/10;
		return objRowNum;
	}
}
