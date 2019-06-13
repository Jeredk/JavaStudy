package ch06;

public class Exam6_2_1 {
	public static void main(String[] args) {

		int result=checkGrade(7);
		System.out.println(result);

	}

/*	static void checkgrade(int num) {

		if (num > 10) {
			System.out.println("1등급");
		} else if (num > 7) {
			System.out.println("2등급");
		} else if (num > 4) {
			System.out.println("3등급");
		} else {
			System.out.println("4등급");
		}

	}*/
	
	static int checkGrade(int weight) {
		if(weight>10) {
			return 1;
		}else if(weight>7) {
			return 2;
		}else if(weight>4) {
			return 3;
		}else{
			return 4;
		}
		
	}

}
