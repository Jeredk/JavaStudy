package ch05;

public class Arr1 {
	public static void main(String[] args) {
		int[] scores = {10,20,30,40};
		
		int last=scores[scores.length-1]; //마지막값
		
		int[] arr = new int[5]; // 5개 공간의 배열 생성
		arr[3] = 300;
//		System.out.println(arr[0]);    Ctrl + / 주석 또는 Shift + Ctrl + C
//		System.out.println(arr[3]);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
