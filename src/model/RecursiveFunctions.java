package model;

public class RecursiveFunctions {
	
	public static long factorial(long number) {
		if(number<=1)
			return 1;
		else
			return (number*factorial(number-1));
	}
	
	public static long fibonacci(long number) {
		if(number==1)
			return 1;
		else if(number==0)
			return 0;
		else
			return fibonacci(number-1)+fibonacci(number-2);
	}
	
	public static int arraySummatory(int[] A) {
		
		return arraySummatory(A, A.length-1);
	}
	
	public static int arraySummatory(int [] A, int n) {
		if(n==0)
			return A[0];
		else
			return A[n]+arraySummatory(A, n-1);
	}

}
