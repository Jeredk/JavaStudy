package ch06;

public class Exam6_2_3 {
	public static void main(String[] args) {
		int result = getlastyear(1);
		System.out.println(result);
	}

	static int getlastyear(int month) {
//		int[] months= {31,28,31,30,31,30,31,31,30,31,30,31};
//		return months[month-1];
		
		
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return 31;
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		} else {
			return 28;
		}
	}

}
