package com.jabreu.codility.lesson3;

/**
 * https://app.codility.com/demo/results/training9CFZF9-AE2/
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
        
        for(int number : A) {
        	sumR -= number;
        	sumL += number;

        	dif = dif > Math.abs(sumL - sumR) && sumR > 0 ? Math.abs(sumL - sumR) : dif;
        }
        
        return dif;
	}
	
	

}
