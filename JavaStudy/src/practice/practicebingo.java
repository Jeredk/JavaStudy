package practice;

public class practicebingo {
	public static void main(String[] args) {

		int[] bmain = new int[25];

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
		
		for (int i = 0; i < bmain.length; i++) {
			System.out.print(bmain[i]+"\t");
			if ((i+1) % 5 == 0) {
				System.out.println();
			}
		}//�迭0~24�� ���� ����
		
		
	}

}
