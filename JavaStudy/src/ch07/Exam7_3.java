package ch07;

public class Exam7_3 {
	public static void main(String[] args) {
		/* Class7_3�� method1(new / static ) ȣ�� */
		Class7_3 c = new Class7_3();
		c.method1();
		
	}
}

class Class7_3 {
	int a;

	public static void method1() {
		System.out.println("method1 ���� ����");
		/* ?? */
		for (int i = 0; i < 5; i++) {
			/* method2�� ȣ���� �� �ֵ��� �ڵ� �ۼ� */
			Class7_3 c=new Class7_3(); //�̰ɷ� �ϰų� method2�� static�� ������ -> ȣ�� method2();
			//�ݺ����� �����ҋ����� ���� �׷��� 1��, for���� �ö󰡸� 1,2,3,4,5�� ���
			c.method2();
//			method2();
		}
		System.out.println("method1 ���� ����");
	}

	public void method2() {
		/* �������� a�� ���� 1�� ���� */
		a++;
		/* �������� a�� �� ��� */
		System.out.println(a);
	}
}