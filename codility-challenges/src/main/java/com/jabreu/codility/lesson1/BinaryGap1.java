package com.jabreu.codility.lesson1;

public class BinaryGap1 {

	/**
	 * Strategy
	 * 
	 * 1 - Parse the number N to binary String 
	 * 2 - Split the binary String in sequences of '0' 
	 * 3 - For each sequence of '0', verify if it is between '1'
	 * and it's the largest sequence of '0' found.
	 * 
	 * https://app.codility.com/demo/results/trainingAVWJDV-ASW/
	 * 
	 * @author jucely
	 *
	 */
	public int solution(int N) {
		// write your code in Java SE 8
		String binary = Integer.toString(N, 2);
		String[] strIntervalo = binary.split("1");
		Integer maiorSequencia = 0;
		for (String str : strIntervalo) {
			String intervalo = "1" + str + "1";
			maiorSequencia = binary.contains(intervalo) && str.length() > maiorSequencia ? str.length()
					: maiorSequencia;
		}
		return maiorSequencia;

	}
}
