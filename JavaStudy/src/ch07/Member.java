package ch07;

//�⺻�� �Ǵ� Ŭ���� - Java Bean(����)
//DTO(Data Transfer Object) / VO(Value Object)
public class Member {
	private String id; //private ->�Ⱥ��̰� ������
	String pw;
	String name;
	int age;
	
	//��Ŭ��->source->generate->Getters and setters
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
	//���� <=>�޼ҵ� 1:1
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		return id;
	}
}