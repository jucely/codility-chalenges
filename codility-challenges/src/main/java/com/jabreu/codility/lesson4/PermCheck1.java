package com.jabreu.codility.lesson4;

/**
 * https://app.codility.com/demo/results/trainingKBUW47-RT6/
 * 
 * @author jucely
 *
 */
public class PermCheck1 {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int missing = 0;
		
        for (int i = 0; i < A.length; i++) {
          missing += i + 1 - A[i];
        }

        return missing == 0 ? 1 : 0;
    }
}
