package ch02;

import java.util.Scanner;

public class Variable {
	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요.");
//
//		// 숫자 입력
//		int n = s.nextInt(); // 키보드 입력 숫자 가져오기, Ctrl + F11 : 클래스 실행
//		System.out.println("입력된 값은 " + n);
//		System.out.println((char) n);
//
//		// 문자 입력
//		String text = s.next();
//		System.out.println("입력된 값은 " + text);
		
	}
	
	
	static void mmain(int i) {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");

		// 숫자 입력
		int n = s.nextInt(); // 키보드 입력 숫자 가져오기, Ctrl + F11 : 클래스 실행
		System.out.println("입력된 값은 " + n);
		System.out.println((char) n);

		// 문자 입력
		String text = s.next();
		System.out.println("입력된 값은 " + text);
	}
}
