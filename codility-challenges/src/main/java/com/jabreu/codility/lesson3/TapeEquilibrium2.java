package com.jabreu.codility.lesson3;

/**
 * https://app.codility.com/demo/results/trainingRFBDJZ-XAQ/
 * 
 * @author jucely
 *
 */
public class TapeEquilibrium2 {
	
	public int solution(int[] A) {      
        int sumL = 0;
        int sumR = 0;
        
        for(int number : A) {
        	sumL += number;
        }
        
        int dif = Math.abs(sumR - sumL);
        
        for(int number : A) {
        	sumR += number;
        	sumL -= number;
        	
        	dif = dif > Math.abs(sumR - sumL) ? Math.abs(sumR - sumL) : dif;
        }
        
        return dif;
	}

}
