package test;
import static org.junit.Assert.*;

import org.junit.Test;

import business.BasicCalculations;

public class CountATest {

	@Test
	public void CountATest() {
		assertEquals(4, BasicCalculations.countA("aaaa"));
		assertEquals(1, BasicCalculations.countA("Somewhere out there, there's someone waiting for me"));
		
	
	}

}
