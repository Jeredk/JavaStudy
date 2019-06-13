package ch04;

import java.util.Calendar;

public class 달력2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		// 현재 월의 1일로 날짜 설정
		cal.set(2019, 1, 1);

		// 현재 날자 정보 알아내기
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; // 월은 0부터 시작하므로 +1을 해줘야함
		int day = cal.get(Calendar.DATE);
		int week = cal.get(Calendar.DAY_OF_WEEK);

		System.out.println("" + year + month + day);
		System.out.println(week); // 일요일=1 토요일=7

		int lastDay = cal.getActualMaximum(Calendar.DATE);
		System.out.println(lastDay);

		// 1일의 실제 요일 위치에 맞도록 반복문 작성가능
		// for() {}

/*		for (int d = 1; d <= lastDay; d++) {
			System.out.print(d + "\t");

			if (week % 7 == 0) { // 토요일이면 줄바꿈
				System.out.println();
			}
			week++;// 일자가 증가 될 때 요일의 숫자도 같이 증가
		}*/

	}

}
