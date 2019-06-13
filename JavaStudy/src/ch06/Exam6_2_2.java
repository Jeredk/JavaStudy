package ch06;

public class Exam6_2_2 {

/*	static int getbetweensum(int a, int b) {
		int c = 0;
		if (a == b) {
			c = a;
			return c;
		} else if (a > b) {
			for (; a >= b; a--) {
				c = c + a;
			}
			System.out.println(c);
			return c;
		} else {
			for (; a <= b; a++) {
				c = c + a;
			}
			System.out.println(c);
			return c;
		}

	}*/
	
	static int getbetweensum(int a,int b) {
//		a=(a>b)?a:b;
		if(a>b) {
			int temp=a;
			a=b;
			b=temp;
		}
		
		int total=0;
		
		for(int start = a;start<=b;start++) {
			total=total+ start;
		}
		
		return total;
	}

	public static void main(String[] args) {
		int result=getbetweensum(5, 1);
		System.out.println(result);
	}

}
