package ch03;

//f2 => ���ϸ� ���氡��
public class Exam03_08 {
	public static void main(String[] args) {
		int num = 10;
		/* System.out.println( (num>=0)?"���":"����" ); // ���� ������ */// ���� num�� ���� ���� ��� �Ǵ� ������ ��� (10 => ��� -3 => ����)

	//	String result = (num > 0) ? "���" : (num == 0) ? "0" : "����";// ���, ����, 0 3���� ���� �Ǵ�
		int point=89;
		char grade;
		if(point>=90) {
		grade='a';	
		}
		else if(point>=80) {
			grade='b';
		}
		else if(point>=70) {
			grade='c';
		}else {
			grade='f';
		}
		System.out.println(grade);
	}
}
