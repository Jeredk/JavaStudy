package practice;

import java.util.Scanner;

public class practicebingo2 {
	public static void main(String[] args) {

		
		
		Scanner inputnumber=new Scanner(System.in);
		System.out.println("Enter the Bingo Size : ");
		int in=inputnumber.nextInt();
		
		int[] bmain = new int[in*in];

		for (int i = 0; i < bmain.length; i++) {
			int num = 1;
			bmain[i] = num + i;
			
//			System.out.print(bmain[i]+"\t");
		}// �迭�� �� �Է�
		
		for(int i=0;i<bmain.length;i++) {
			
			int random=(int) (Math.random()*bmain.length);
			int empty=0;

			empty=bmain[i];
			bmain[i]=bmain[random];
			bmain[random]=empty;						
		}//����
		System.out.println("\n");
		for (int i = 0; i < bmain.length; i++) {
			System.out.print(bmain[i]+"\t");
			if ((i+1) % in == 0) {
				System.out.println();
			}
		}//bmain[0]~bmain[24] ����
		
		System.out.println("\n\nBINGO SIZE IS " + in + " X " + in);

	}

}
