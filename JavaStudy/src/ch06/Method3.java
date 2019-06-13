package ch06;

public class Method3 {
	static void third() {
		System.out.println("third »£√‚");
		System.out.println(4/0);
		int[] arr=new int[3];
		System.out.println(arr[5]);
	}
	static void second() {
		third();
	}
	static void first() {
		second();
	}
	public static void main(String[] args) {
		first();
		// Stack, Queue
	}

}
