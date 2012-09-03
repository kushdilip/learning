package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testGetMessage() {
//		fail("Not yet implemented");
		HelloWorld helloWorld = new HelloWorld();
		String messageString = helloWorld.getMessage();
		assertEquals("Hello World!", messageString);
	}

}
