package ch04;

public class Exam04_2 {
	public static void main(String[] args) {
		int score = 6;
		if (score % 2 == 0 && score % 3 == 0) {
			System.out.println("��¦");
		} else if (score % 2 == 0) {
			System.out.println("¦");
		} else if (score % 3 == 0) {
			System.out.println("��");
		} else {
			System.out.println("score");
		}//��찡 ���� ��, ū ���� �� ���� �÷���

	}
}
/*
 * ������ int score = 2; => ¦ int score = 15; => �� int score = 12; => ��¦
 */