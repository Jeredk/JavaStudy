package ch05;

import java.util.Arrays;

public class ArrayExam4 {
	public static void main(String[] args) {
		int[] numbers = { 3, 2, 1, 7, 4 };

//		int min = 0;
/*		int min=Integer.MAX_VALUE;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min || min == 0) {
				min = numbers[i];
			}
		}
		System.out.println("최소값 : " + min);*/
		
		System.out.println(numbers);
		
		Arrays.sort(numbers); //정렬
		
		System.out.println(numbers);
	}
}