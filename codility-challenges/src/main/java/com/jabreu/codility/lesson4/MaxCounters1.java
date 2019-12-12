package com.jabreu.codility.lesson2;

import java.util.Arrays;

/**
 * 
 * https://app.codility.com/demo/results/trainingEHBMNJ-MRJ/
 * 
 * @author jucely
 *
 */
public class MaxCounters1 {

	public int[] solution(int N, int[] A) {
    // write your code in Java SE 8
		int[] result = new int[N];
		int maxValue = 0;

		for (int index = 0; A.length > index; index++) {
			int number = A[index];
			if (number > N) {
				Arrays.fill(result, maxValue);
			} else {
				result[number - 1]++;
				maxValue = maxValue < result[number - 1] ? result[number - 1] : maxValue;
			}
        }

		return result;
    }
}
