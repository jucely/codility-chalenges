package com.jabreu.codility.lesson2;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet tem O(1) em operações de "contains", "remove" e "add"
 * 
 * https://app.codility.com/demo/results/training5NFV6Y-M3E/
 * @author jucely
 *
 */
public class OddOccurrencesInArray3 {

	public int solution(int[] A) {
		Set<Integer> values = new HashSet<>();
		for (int index = 0; A.length > index; index++) {
			if (values.contains(A[index])) {
				values.remove(A[index]);
			} else {
				values.add(A[index]);
			}

		}

		return !values.isEmpty() ? values.toArray(new Integer[0])[0] : 0;
	}
}
