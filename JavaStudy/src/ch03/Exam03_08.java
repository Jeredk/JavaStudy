package ch03;

//f2 => 파일명 변경가능
public class Exam03_08 {
	public static void main(String[] args) {
		int num = 10;
		/* System.out.println( (num>=0)?"양수":"음수" ); // 삼항 연산자 */// 변수 num의 값에 따라 양수 또는 음수를 출력 (10 => 양수 -3 => 음수)

	//	String result = (num > 0) ? "양수" : (num == 0) ? "0" : "음수";// 양수, 음수, 0 3가지 경우로 판단
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
