package com.jabreu.codility.lesson3;

/**
 * https://app.codility.com/demo/results/trainingTTPGMD-CDD/
 * 
 * @author jucely
 *
 */
public class FrogJmp2 {
	public int solution(int X, int Y, int D) {
		// write your code in Java SE 8
		int dif = Y - X;
		int jump = dif % D > 0 ? dif / D + 1 : dif / D;
		return jump;
	}
}
