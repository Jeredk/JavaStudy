package ch04;

import java.util.Scanner;

public class Exam04_3 {
	public static void main(String[] args) {
		/*int year = 2000; // ����
		if (year % 400 == 0) {
			System.out.println("����");
		} else if (year % 100 == 0) {
			System.out.println("���");
		} else if (year % 4 == 0) {
			System.out.println("����");
		} else {
			System.out.println("���");
		}*/
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("��(��)���� �Է��ϼ���. : ");
		int y = scanner.nextInt();
		//int year = 0; // ����
		if (y % 400 == 0) {
			System.out.println("����");
		} else if (y % 100 == 0) {
			System.out.println("���");
		} else if (y % 4 == 0) {
			System.out.println("����");
		} else {
			System.out.println("���");
		}

	}
}

/*
 * �����̸� '�����Դϴ�', '����Դϴ�' ��� ��� ��) year = 1904 '�����Դϴ�' year = 2000 '�����Դϴ�' year =
 * 2200 '����Դϴ�' year = 1997 '����Դϴ�' ���� ��� ������ 4�� ������ �������� �ش� �������� �Ѵ� (2004��,
 * 2008��, 2012��, 2016��, ��) �� �߿��� 100���� ������ �������� �ش� ������� �Ѵ� (1900��, 2100��, 2200��,
 * 2300��, 2500��, ��) �� �߿��� 400���� ������ �������� �ش� �������� �д� (1600��, 2000��, 2400��, ��) ��
 * �̿� ��� �ش� ������� �Ѵ� (1997��, 2003��, 2009��, ...)
 */