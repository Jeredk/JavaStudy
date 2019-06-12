package ch04;

public class Exam04_2 {
	public static void main(String[] args) {
		int score = 6;
		if (score % 2 == 0 && score % 3 == 0) {
			System.out.println("쿵짝");
		} else if (score % 2 == 0) {
			System.out.println("짝");
		} else if (score % 3 == 0) {
			System.out.println("쿵");
		} else {
			System.out.println("score");
		}//경우가 많은 것, 큰 조건 을 위로 올려줌

	}
}
/*
 * 실행결과 int score = 2; => 짝 int score = 15; => 쿵 int score = 12; => 쿵짝
 */