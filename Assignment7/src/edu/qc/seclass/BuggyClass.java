/*
Name: Muhammad Niazi
Class: 370-32
*/

package edu.qc.seclass;
public class BuggyClass {

	//First method
	public static int buggyMethod1(int x, int y){
		if(y == 0) { 
			if(x % 2 == 0) {
				return x / y;
			}
			else { 
				if(x % 5 == 0 ) {
					return x / y;
				}
				y = 1; 
				return x / y;
			}
		}
		else {
			return x / y;
		}
	}
	
	//Second method
	public static int buggyMethod2(int x, int y) { 
		if(y == 0) { 
			y += 2;
		}
		return x / y;
	}
	
	//Third method
	public static void buggyMethod3(int x, int y) { 
		/*
		Making this is impossible. 
		This method is not possible because 
		the coverage for the branch doesn't show the fault and has 100% branch coverage, 
		then we can never find the fault as it is 100% hidden.
		Making it one of the branches we trigger the previous test of 100% and the branch coverage would fail, 
		forcing us to put the error in the statement coverage portion, which would be impossible to achieve.
		*/
	}
	
	//Fourth method
	public static void buggyMethod4(int first, int second) { 
		/*
		Making this is impossible as well because of the same reason as the previous method.
		We cant write a method that guarantees 100 percent statement coverage even if the branch coverage is less than 100%
		*/
	}
	
	//Fifth method
	public static void buggyMethod5(int i) { 
		/*
		Given code:
		1. public void buggyMethod5 (int i) {
			2. int x;
			3. [point where you can add code]
			4. x = i/0; //This is the line that causes the error
			5. [point where you can add code]
			6. }
		This method is not possible because we're given zero as the denominator on 4th step.
		We are not allowed to use any exceptions so we can't throw an exception.
		*/
	}
}
