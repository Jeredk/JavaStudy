package ch07;

public class Triangle {
	float bottom;
	float height;
	public float getBottom() {
		return bottom;
	}
	public void setBottom(float bottom) {
		this.bottom = bottom; //this->지역변수, bottom->전역변수

	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	
	// 넓이 구하기 메소드 (float)
	// 밑변 저장 set 메소드 (void)
	// 높이 저장 set 메소드 (void)
}