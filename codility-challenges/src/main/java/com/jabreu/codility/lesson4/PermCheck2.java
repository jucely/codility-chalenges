package com.jabreu.codility.lesson4;

import java.util.HashSet;
import java.util.Set;

/**
 * https://app.codility.com/demo/results/trainingXM8PX7-EXD/
 * 
 * @author jucely
 *
 */
public class PermCheck2 {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> values = new HashSet<>();
        int missing = 0;
		
        for (int i = 0; i < A.length; i++) {
          missing += i + 1;
          if(!values.contains(A[i]) && A[i] <= A.length){
              values.add(A[i]);
              missing -= A[i];
          }
        }

        return missing == 0 ? 1 : 0;
    }
}
