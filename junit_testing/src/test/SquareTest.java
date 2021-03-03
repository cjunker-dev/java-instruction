package test;
import static org.junit.Assert.*;

import org.junit.Test;

import business.BasicCalculations;

public class SquareTest {

	@Test
	public void SquareTest() {
		assertEquals(4, BasicCalculations.square(2));
		
		assertEquals(16, BasicCalculations.square(4));
		
		
	
	}

}
