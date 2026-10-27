package recursionPractice;

public class RecursiveMethods {

	/*This method should take in a single parameter n, and return the value of the 
	 * nth term in the recurrent sequence defined as follows. Note that 
	 * A_0 is the 0th term of the sequence, A_(n-1) is the n-1th term, etc
	 * A_n = 5 * A_(n-1) + 3*A_(n-2) + 4
	 * A_0 = 0
	 * A_1 = 4
	 * A_2 = 24
	 * ...
	 */
	public static int solveRelation(int n) {
		throw new UnsupportedOperationException("You must write this method.");

	}
	
	/*
	 * This method should return the number of times the ith element of arr1 is 
	 * equal to the ith element of arr2. If either array is empty, then the method 
	 * should just return 0. If either array is null then the method should return 
	 * -1. Otherwise it should count the number of times an element of arr1 appears
	 * at the same position in arr2. For example, take the following arrays:
	 * 2,4,7,1,4,5
	 * 1,4,3,2,6,5
	 * If these two arrays are passed in, then 2 should be returned since the 1st
	 * element and the 5th element of each are equal (when using 0-indexing)
	 */
	public static int numSameElements(int[] arr1, int[] arr2) {
		throw new UnsupportedOperationException("You must write this method.");

	}
	
	/*this method should return true if the given array with length n
	 * contains the first n elements of the fibonnaci sequence and false otherwise
	 * For the sake of this method the fibonnaci sequence starts with F_0 = 0, 
	 * F_1 = 1, F_2 = 1, F_3 = 2, F_4 = 3, F_5 = 5, F_6 = 8, F_7 = 13, ...
	 * You are encouraged to write at least one helper method in order to complete
	 * this method. 
	 */
	public static int isFibonnaci(int[] arr) {
		throw new UnsupportedOperationException("You must write this method.");
	}
	
	
	/*This version of the method is commented out because it is more difficult 
	 * than anything you would be asked on the exam, however it is an interesting
	 * problem to work on if you are interested and feel confident in other areas 
	 * of the content for the exam.
	 * 
	 * This method should return true if the given array is a sublist of the 
	 * fibonnaci sequence and false otherwise. This differs from the previous 
	 * problem since the array may not start with F0 = 0. However we still require
	 * that the elements of the array are in the same order they would appear in 
	 * the fibonnaci sequence. 
	 *
	 * public static int isFibonnaciSublist(int[] arr) {
	 * 	  throw new UnsupportedOperationException("You must write this method.");
	 * }
	 */
	
}
