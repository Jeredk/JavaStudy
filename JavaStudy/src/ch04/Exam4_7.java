package ch04;

public class Exam4_7 {
	public static void main(String[] args) {
/*		int space = 0;// ����4
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				//alt+����Ű(��/�Ʒ�)
				// j�� ���� ���麸�� ���ٸ� ����, �ƴϸ� *
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
