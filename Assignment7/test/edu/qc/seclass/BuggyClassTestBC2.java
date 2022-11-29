package edu.qc.seclass;
import static edu.qc.seclass.BuggyClass.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BuggyClassTestBC2 {
	@Test
	public void firstTest() { 
		assertEquals(5, buggyMethod2(10,0));
	}
	
	@Test
	public void secondTest() { 
		assertEquals(10, buggyMethod2(20,0));
	}
}
