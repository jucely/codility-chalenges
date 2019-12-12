package com.jabreu.codility.lesson4;

import java.util.HashSet;
import java.util.Set;

/**
 * https://app.codility.com/demo/results/trainingHJVB9M-EAP/
 *
 * @author jucely
 *
 */
public class FrogRiverOne1 {
	public int solution(int X, int[] A) {
        // write your code in Java SE 8
		Set<Integer> leaves = new HashSet<>();

		int seconds = -1;

		for (int jump = 1; X >= jump; jump++) {
			while (!leaves.contains(jump)) {
				if (A.length <= seconds + 1) {
					seconds = -1;
					break;
				}
				seconds++;
				leaves.add(A[seconds]);
			}
        }

		return seconds;
    }

}
