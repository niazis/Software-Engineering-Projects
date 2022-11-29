package edu.qc.seclass;
import static edu.qc.seclass.BuggyClass.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BuggyClassTestSC2 {
	@Test
	public void firstTest() { 
		assertEquals(10, buggyMethod2(20,0));
	}
	
	@Test 
	public void secondTest() { 
		assertEquals(6, buggyMethod2(12,0));
	}
	
}
