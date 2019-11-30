package com.jabreu.codility.lesson2;

import java.util.ArrayList;
import java.util.List;

//https://app.codility.com/demo/results/training4XDPRG-ZJQ/
public class OddOccurrencesInArray2 {
	
	public int solution(int[] A) {
        List<Integer> values = new ArrayList<>();
        for(int index = 0 ; A.length > index; index++){
            Integer value = new Integer(A[index]);
            
            if(values.contains(value)){
                values.remove(value);
            } else {
                values.add(value);
            }
            
        }
        
        return !values.isEmpty() ? values.get(0) : 0;
	}
}
