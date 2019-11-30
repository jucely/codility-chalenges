package com.jabreu.codility.lesson2;

import java.util.ArrayList;
import java.util.List;


/**
 * Primeira solução
 * 
 * https://app.codility.com/demo/results/trainingYYNKY9-BFX/
 * 
 * @author jucely
 *
 */

public class OddOccurrencesInArray1 {
	public int solution(int[] A) {
		int unpair = 0;
		List<Integer> indexes = new ArrayList<>();
		for (int index = 0; A.length > index; index++) {
			if (!indexes.contains(new Integer(index)) && !find(indexes, A, A[index], index + 1)) {
				unpair = A[index];
			}
		}
		return unpair;
	}

	private boolean find(List<Integer> indexes, int[] B, int number, int indexStart) {
		for (int index = indexStart; B.length > index; index++) {
			if (B[index] == number) {
				indexes.add(index);
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}

}
