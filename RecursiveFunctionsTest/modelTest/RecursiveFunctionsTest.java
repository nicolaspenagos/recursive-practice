package modelTest;
import model.RecursiveFunctions;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RecursiveFunctionsTest {
	

	@Test
	void factorialTest() {
		assertTrue("Factorial of 5 is wrong", RecursiveFunctions.factorial(5)==120);
		assertTrue("Factorial of 10 is wrong", RecursiveFunctions.factorial(10)==3628800);
		assertTrue("Factorial of 0 is wrong", RecursiveFunctions.factorial(0)==1);
	}
	
	@Test 
	void fibonacciTest() {
		assertTrue("Fibonacci of 0 is wrong", RecursiveFunctions.fibonacci(0)==0);
		assertTrue("Factorial of 4 is wrong", RecursiveFunctions.fibonacci(4)==3);
		assertTrue("Factorial of 8 is wrong", RecursiveFunctions.fibonacci(8)==21);
	}
	
	@Test
	void arraySummatoryTest() {
		int[] A = {2,3,4,2};
		int[] B = {2,3,4,200};
		int[] C = {2,1,2,3,4,200,1000};
		assertTrue("The sume is wrong", RecursiveFunctions.arraySummatory(A)==11);
		assertTrue("The sume is wrong", RecursiveFunctions.arraySummatory(B)==209);
		assertTrue("The sume is wrong", RecursiveFunctions.arraySummatory(C)==1212);
	}

}
