package day6.snakeandladder;

import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeTest {

	@Test
	public void testSnake() throws Exception {
		Snake snake = new Snake(new Position(10), new Position(3));
		assertNotNull(snake);
	}

	@Test
	public void testGetHead() throws Exception {
		Snake snake = new Snake(new Position(30), new Position(20));
		assertEquals(30,snake.getHead().getPositionNumber());
	}

	@Test
	public void testGetTail() throws Exception {
		Snake snake = new Snake(new Position(23), new Position(23));
		assertEquals(20,snake.getTail().getPositionNumber());

	}

}
