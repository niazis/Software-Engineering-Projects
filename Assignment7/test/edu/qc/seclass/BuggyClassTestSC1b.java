package edu.qc.seclass;
import static edu.qc.seclass.BuggyClass.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BuggyClassTestSC1b {

	public void firstTest() { 
		assertEquals(1, buggyMethod1(1,0));
	}
	
	@Test 
	public void secondTest() { 
		assertEquals(4, buggyMethod1(4,0));
	}
	   
}
