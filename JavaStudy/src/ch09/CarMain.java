package ch09;

public class CarMain {
	static void driver(Car c) { //������(�԰��� ���� �κп��� ���� �����),extends�̿�->���
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
