package ch06;

public class Exam6_1 {
	public static void main(String[] args) {
		int result1 = plus(5, 3);
		System.out.println("plus => " + result1);

		int result2 = minus(5, 3);
		System.out.println("minus => " + result2);
	}

	static int plus(int num1, int num2) {
		// 코드 작성
		return num1+num2;
		
	}

	static int minus(int num1, int num2) {
		// 코드 작성
		return num1-num2;
	}
}
//출력 결과
//plus => 8
//minus => 2