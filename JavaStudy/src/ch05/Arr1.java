package ch05;

public class Arr1 {
	public static void main(String[] args) {
		int[] scores = {10,20,30,40};
		
		int last=scores[scores.length-1]; //��������
		
		int[] arr = new int[5]; // 5�� ������ �迭 ����
		arr[3] = 300;
//		System.out.println(arr[0]);    Ctrl + / �ּ� �Ǵ� Shift + Ctrl + C
//		System.out.println(arr[3]);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
