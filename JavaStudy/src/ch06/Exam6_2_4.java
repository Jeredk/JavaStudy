package ch06;

public class Exam6_2_4 {
	public static void main(String[] args) {
		String result=dilemma(true,true);
		System.out.println(result); 
	}

	static String dilemma(boolean a, boolean b) {

		if (a && b) {
			return "5��";
		} else if (!a && !b) {
			return "1��";
		} else if (a && !b) {
			return "a ����, b 10��";
		} else if (!a && b) {
			return "a 10��, b ����";
		}

		return ""; 
	}
}
