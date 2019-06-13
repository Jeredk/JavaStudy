package ch06;

public class Exam6_2_4 {
	public static void main(String[] args) {
		String result=dilemma(true,true);
		System.out.println(result); 
	}

	static String dilemma(boolean a, boolean b) {

		if (a && b) {
			return "5년";
		} else if (!a && !b) {
			return "1년";
		} else if (a && !b) {
			return "a 석방, b 10년";
		} else if (!a && b) {
			return "a 10년, b 석방";
		}

		return ""; 
	}
}
