package ch04;

public class Exam4_7 {
	public static void main(String[] args) {
/*		int space = 0;// 여백4
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				//alt+방향키(위/아래)
				// j의 값이 여백보다 적다면 공백, 아니면 *
				if (j <= space) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			space += 1;// space=space-1;
			System.out.println();
		}*/
		int space =5;
		for(int i = 1;i<=5;i++) {
			for(int j=5;j>=1;j--) {
				if(j<=space) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			space--;
		System.out.println();
		}
	}

}
