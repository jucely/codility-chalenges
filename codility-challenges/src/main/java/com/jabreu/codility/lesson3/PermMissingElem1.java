package com.jabreu.codility.lesson3;

/**
 * https://app.codility.com/demo/results/trainingN76HM6-3RX/
 * 
 * @author jucely
 *
 */
public class PermMissingElem1 {
	public int solution(int[] A) {
		// write your code in Java SE 8
		int missing = A.length + 1;
		
		for (int i = 0; i < A.length; i++) {
			missing += i + 1 - A[i];
		}

		return missing;
	}
}
