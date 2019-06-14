package ch09;

public class CarMain {
	static void driver(Car c) { //다형성(규격이 같은 부분에서 대해 적용됨),extends이용->상속
		c.move(10, 10);
		c.stop();
	}
	
/*	static void driver(Car_Ray c) {
		c.move(10, 10);
		c.stop();
	}
	
	static void driver(Car_Pride c) {
		c.move(10, 10);
		c.stop();
	}*/
	
	public static void main(String[] args) {
		
		Car_Pride c1=new Car_Pride();
		driver(c1);
		Car_Ray c2=new Car_Ray();
		driver(c2);
	}

}
