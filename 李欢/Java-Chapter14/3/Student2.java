package chapter14;

public class Student2 {
	private String name;
	private int age;
	private String sex;
	private String major;
	public Student2(String name,int age){
		this.name = name;
		this.age = age;
		this.sex ="男";
		this.major="软件工程";		
	}
	public Student2(String name, int age, String sex, String major) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.major = major;
	}
	public void show(){
		System.out.println("大家好，我叫"+getName()+",我今年"+getAge()+"岁,性别"+getSex()+",专业是"+getMajor());
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
}
