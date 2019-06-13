package ch06;

import java.util.Scanner;

public class Method1 {
	//전역변수, 멤버변수 <= 클래스 영역
	static int age;
	int score;
	
	
	static int input() {
		//지녁변수
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		return num;
	}

	public static void main(String[] args) {
		System.out.println("값을 입력해주세요.");
		int num = input();		
		
		System.out.println("입력된 값은? "+num);
	}

}
