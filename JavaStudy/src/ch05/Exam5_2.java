package ch05;

public class Exam5_2 {
	public static void main(String[] args) {
		int[] arr = new int[10];

		/* 인덱스가 2의 배수인 경우에만 값 입력 */
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				arr[i] = i + 10; // 10 12 14 16 18
//				System.out.println();
			}
		}

		int sum = 0;
		int count = 0;
		float avg = 0f;
		// 코드작성

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				sum = sum + arr[i];
				count++;
			}

		}
		avg = (float)sum / count;

		System.out.println("합 : " + sum);
		System.out.println("평균 : " + avg);
	}
}

//값이 0이 아닌 배열요소의 합과 평균을 구하는 코드 작성