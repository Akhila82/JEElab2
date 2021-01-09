
package com.JEElab2.lab2.util;

/**
 * @author Akhila
 *
 */

public class SecondSmallest {

	public int getSecondSmallest(int numbers[]) {
		if(isEmpty(numbers)) {
			return 0;
		}
		else if(numbers.length==2) {
			return Math.max(numbers[0], numbers[1]);
		}
		return numbers[0];
	}

	private boolean isEmpty(int[] numbers) {
		return numbers.length==0;
	}

}
