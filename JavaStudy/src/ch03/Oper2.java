package ch03;

public class Oper2 {
	public static void main(String[] args) {
		int num = 2324; // 각 자리 합 2+3+2+4
		int n1 = num%10; //몫 232 나머지4
		System.out.println(n1);
		int n2 = (num/10)%10;
		System.out.println(n2);
		int n3 = (num/100)%10;
		System.out.println(n3);
		int n4 = (num/1000);
		System.out.println(n4);
	}

}
