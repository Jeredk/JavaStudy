package ch04;

import java.util.Scanner;

public class memo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		for (int i=1; i <= 9;i++) {
			System.out.println(a+"X"+i+"="+a*i);
			
		}
	}

}
