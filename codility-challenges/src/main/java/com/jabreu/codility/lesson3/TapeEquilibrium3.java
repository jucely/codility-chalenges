package com.jabreu.codility.lesson3;

/**
 * https://app.codility.com/demo/results/trainingAHNVR8-DUP/
 * 
 * @author jucely
 *
 */
public class TapeEquilibrium3 {
	
	public int solution(int[] A) {      
        // write your code in Java SE 8
        int sumL = 0;
        int sumR = 0;

        for(int number : A) {
        	sumR += number;
        }
        
        int dif = Math.abs(sumL - sumR);
        
        for(int number : A) {
        	sumR -= number;
        	sumL += number;

        	dif = (dif > Math.abs(sumL - sumR) || dif == 0) && ( Math.abs(sumL - sumR) != 0) ? Math.abs(sumL - sumR) : dif;
        }
        
        return dif;
	}
	
	

}
