package com.jabreu.codility.lesson3;

/**
 * https://app.codility.com/demo/results/trainingC52QT6-4MG/
 * 
 * @author jucely
 *
 */
public class TapeEquilibrium4 {
	
	public int solution(int[] A) {      
		// write your code in Java SE 8
		int sumL = 0;
		int sumR = 0;

		for(int number : A) {
			sumR += number;
		}

		int dif = Integer.MAX_VALUE;

		for(int index = 0; A.length > index + 1 ; index++) {
			int number = A[index];
			sumR -= number;
			sumL += number;

			dif = dif > Math.abs(sumL - sumR)? Math.abs(sumL - sumR) : dif;
		}

		return dif;
	}
	
	

}
