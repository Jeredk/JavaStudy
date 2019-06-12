package practice;

public class Practice00 {
	public static void main(String[] args) {
		for (int i = 1; i <= 25; i++) {
			if (i < 10) {
				System.out.print("0" + i + "\t");
			} else {
				System.out.print(i + "\t");
			}
			if (i % 5 == 0) {
				System.out.println("");
			}
		}
	}

}
