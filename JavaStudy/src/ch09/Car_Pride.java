package ch09;

public class Car_Pride extends Car {
	public void move(int x, int y) {
		System.out.println(tire); //Car���� int tire=4�� ��������
		System.out.printf("%s, %s �����̵� �̵�", x, y);
	}

	public void stop() {
		System.out.println("�����̵� ����");
	}
}
