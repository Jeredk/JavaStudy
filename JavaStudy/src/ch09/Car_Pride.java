package ch09;

public class Car_Pride extends Car {
	public void move(int x, int y) {
		System.out.println(tire); //Car에서 int tire=4를 물려받음
		System.out.printf("%s, %s 프라이드 이동", x, y);
	}

	public void stop() {
		System.out.println("프라이드 멈춤");
	}
}
