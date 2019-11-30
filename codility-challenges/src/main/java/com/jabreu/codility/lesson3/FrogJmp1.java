package com.jabreu.codility.lesson3;

/**
 * https://app.codility.com/demo/results/trainingSPW23U-DVS/
 * 
 * @author jucely
 *
 */
public class FrogJmp1 {
	public int solution(int X, int Y, int D) {
		// write your code in Java SE 8
		int dif = Y - X;
		int jump = dif / D;
		jump = (jump * D) + X < Y ? jump + 1 : jump;
		return jump;
	}
}
