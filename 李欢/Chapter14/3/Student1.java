package chapter14;

public class Student1 {
	private String name;
	private int age;
	public void show(){
		System.out.println("我叫"+getName()+"，我今年"+getAge()+"岁");
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
			System.out.println("年龄不能小于15岁，否则默认18岁");
		}else{
		this.age = age;
		}
	}

	
}
