package ch07;

//기본이 되는 클래스 - Java Bean(원두)
//DTO(Data Transfer Object) / VO(Value Object)
public class Member {
	private String id; //private ->안보이게 숨겨줌
	String pw;
	String name;
	int age;
	
	//우클릭->source->generate->Getters and setters
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//변수 <=>메소드 1:1
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		return id;
	}
}