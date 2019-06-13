package ch04;

public class Star1 {
	public static void main(String[] args) {
//		int count = 5;
//		for (int i = 1; i <= count; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("@");
//			}
//			System.out.println();
//		}

		print(3,"Q");
		print(7,"#");
	}

	
	static void print(int count, String s) {
		for (int i = 1; i <= count; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(s);
			}
			System.out.println();
		}
	}
}
