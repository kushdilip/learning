package day6.snakeandladder;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class BoardTest {

	@Test
	public void testGetInstance() throws Exception {
		// fail("Not yet implemented");
		MyBoard board = MyBoard.getInstance();
	}

	@Test
	public void testThrowDice() throws Exception {
		// fail("Not yet implemented");
		MyBoard board = MyBoard.getInstance();
		int diceResult = MyBoard.throwDice();
		assertEquals(true, diceResult > 0 && diceResult <= 6);
	}

	@Test
	public void testStartGame() throws Exception {
		// fail("Not yet implemented");
		MyBoard board = MyBoard.getInstance();
		// Player[] players = board.decideWhoMovesFirst();
		board.startGame();
	}

	@Test
	public void createSnakeTest() throws Exception {
		int[] snakeHeadValues = { 100, 34, 56, 98 };
		int[] snakeTailValues = { 10, 14, 27, 62 };
		Snake[] snakes;
		MyBoard board = MyBoard.getInstance();
		snakes = board.createSnakes(snakeHeadValues, snakeTailValues);
		assertEquals(0, board.findSnake(snakes, 100));
	}

	@Test
	public void readSnakeLadderFileTest() throws Exception {
		String inFileName = "D:\\workspace\\Learning\\Data\\snakeNladdder.txt";
		MyBoard board = MyBoard.getInstance();
		//ArrayList<int[]> snakeLadderArrays = board.readSnakeLadderFile(inFileName);
//		assertArrayEquals(snakeLadderArrays.get(0), new int[] { 17,24,34,47});
	}
}
