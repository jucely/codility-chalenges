package com.jabreu.codility.lesson4;

import java.util.HashSet;
import java.util.Set;


/**
 * https://app.codility.com/demo/results/trainingJGQ7SV-DFJ/
 *
 * @author jucely
 *
 */
public class MissingInteger1 {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> values = new HashSet<>();
        
        for(int number : A){
            values.add(number);
        }
        
        int result = 1;
        
        while(values.contains(result)){
            result++;
        }
        
        return result;
        
    }
}
