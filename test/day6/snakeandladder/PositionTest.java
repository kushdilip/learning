package day6.snakeandladder;

import static org.junit.Assert.*;

import org.junit.Test;

public class PositionTest {

	@Test
	public void testPosition() throws Exception {
		try {
			Position myPosition = new Position(101);
			assertTrue(false);
		} catch (Exception e) {
			// TODO: handle exception
			//System.out.println("Only positive position allowed");
			assertTrue(true);
		}
	}
	@Test
	public void testGetPositionNumber() throws Exception {
//		fail("Not yet implemented");
		Position myPosition = new Position(6);
		assertEquals(6,myPosition.getPositionNumber());
	}

}
