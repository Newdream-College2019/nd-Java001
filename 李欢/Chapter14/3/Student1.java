package chapter14;

public class Student1 {
	private String name;
	private int age;
	public void show(){
		System.out.println("�ҽ�"+getName()+"���ҽ���"+getAge()+"��");
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
		if(age<15){
			this.age=18;
			System.out.println("���䲻��С��15�꣬����Ĭ��18��");
		}else{
		this.age = age;
		}
	}

	
}
