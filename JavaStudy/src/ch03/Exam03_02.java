package ch03;

public class Exam03_02 {
	public static void main(String[] args) {
		//오버플로우 int div = 5/2;
		double div = 5 / (double)2; //or doubel dive = (double)5/2;  or 5.0 2.0
		System.out.println("나누기 결과 : " + div);
	}

}
