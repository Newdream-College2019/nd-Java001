package course14;

public class Student1 {
	private String name;
	private int age;
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
		}else{
			this.age = age;
		}
	}
	public void show(){
		System.out.println("大家好，我叫"+name+",今年"+age+"岁。");
	}
}
