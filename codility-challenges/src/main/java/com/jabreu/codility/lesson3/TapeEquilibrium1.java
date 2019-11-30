package com.jabreu.codility.lesson3;

/**
 * https://app.codility.com/demo/results/trainingDZAMPZ-N9Z/
 * 
 * @author jucely
 *
 */
public class TapeEquilibrium1 {
	
	public int solution(int[] A) {
        int endIndex = A.length - 1;
        int beginIndex = 0;
        
        int sumL = 0;
        int sumR = 0;
        
        while(A.length > 0 && beginIndex <= endIndex){
            if(sumL <= sumR){
                sumL += Math.abs(A[beginIndex]);
                beginIndex++;
            } else {
                sumR += Math.abs(A[endIndex]);
                endIndex--;
            }
        }
        
        return Math.abs(sumL - sumR);
	}

}
