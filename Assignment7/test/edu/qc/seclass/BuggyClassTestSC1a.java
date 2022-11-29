package edu.qc.seclass;
import static edu.qc.seclass.BuggyClass.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class BuggyClassTestSC1a {

	@Test
	 public void firstTest() { 
		assertEquals(7, buggyMethod1(7,0));
	}
	
	@Test 
	public void secondTest() { 
		assertEquals(13, buggyMethod1(13,0));
	}
}
