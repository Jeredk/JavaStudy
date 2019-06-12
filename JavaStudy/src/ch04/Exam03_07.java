package ch04;

import java.util.Scanner;

//소스코드 정렬 : Shift + Ctrl + F  or menu->fomat
public class Exam03_07 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int i = input.nextInt();
		int num = 12345;
		int total=0;
		
		for( ; i>0 ; i=i/10) {
			int n=i%10;
			System.out.println(n);
			total+=n;
		}
		System.out.println(total);
		
		
		
		
		
		/*int num1 = num % 10;	//일의 자리 숫자
		int num2 = (num / 10) % 10;
		int num3 = (num / 100) % 10;
		int num4 = (num / 1000) % 10;
		int num5 = (num / 10000) % 10;
		int total = num1 + num2 + num3 + num4 + num5;
		System.out.println("각 자리 숫자의 합 : " + total);*/
	}
	

}
