package ch05;

public class Exam5_1 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// 코드 작성
		
		String sep=""; //구분자
		
		for (int i = 0; i < arr.length; i++) {
			// 인덱스 i, 실제 요소 값 arr[i]
			if(i%2==0) {
				System.out.print(sep +arr[i]);
				sep=", ";
			}
			
					
/*			int value = arr[i];
			if (value % 2 != 0) {
				System.out.print(sep + value);
				sep=", ";
			}*/

		}
	}
}