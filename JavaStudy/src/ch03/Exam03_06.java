package ch03;

import java.util.Scanner;

public class Exam03_06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("2자리 정수 입력(10~99)>>");
		int n = scanner.nextInt();// 3  3
		
		int ten = 0;
		int one = 0;
		
		boolean isMatch = false;
		
		ten = n/10;
		one = n%10;
		
		isMatch = ten == one;
		System.out.println(isMatch);
		
	}

}
