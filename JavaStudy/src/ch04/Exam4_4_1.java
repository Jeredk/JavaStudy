package ch04;

public class Exam4_4_1 {
	public static void main(String[] args) {

		int total = 0;// ���� ������Ű�� ���� ����

		for (int i = 1; i <= 99; i++) {
//			total = total + i;
	//		System.out.println(total);
			
			//7�� ����� �� ���ϱ�
			if(i%7==0) {
				total=total+i;
			}
		}
		System.out.println(total);
		// �ڵ� �ۼ�
	}
}
//1~99�� �� ���ϱ�