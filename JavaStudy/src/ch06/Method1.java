package ch06;

import java.util.Scanner;

public class Method1 {
	
	/*	static int input() {
		//지역변수
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		return num;
	}

	public static void main(String[] args) {
		System.out.println("값을 입력해주세요.");
		int num = input();		
		
		System.out.println("입력된 값은? "+num);*/
		
		
	int input() {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		return num;		
	}
	
	public static void main(String[] args) {
		
		
		Method1 m=new Method1();
		m.input();
		
		new Method1().input();
	}

}
