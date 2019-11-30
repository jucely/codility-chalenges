package com.jabreu.codility.lesson2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://app.codility.com/demo/results/trainingYEBR57-AR9/
 * 
 * @author jucely
 *
 */

public class CyclicRotation1 {
	public int[] solution(int[] A, int K) {
		List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());

		for (int i = 0; i < K && !list.isEmpty(); i++) {
			Integer lastIten = list.get(list.size() - 1);
			list.remove(list.size() - 1);
			list.add(0, lastIten);
		}

		return list.stream().mapToInt(i -> i).toArray();

	}

	public static void main(String[] args) {
		CyclicRotation1 sol = new CyclicRotation1();
		sol.solution(new int[] {}, 4);
		sol.solution(new int[] { 3, 8, 9, 7, 6 }, 4);
	}
}
