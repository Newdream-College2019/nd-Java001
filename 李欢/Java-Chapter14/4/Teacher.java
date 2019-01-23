package chapter14;

public class Teacher {
	private String name;
	private int age;
	private String sex;
	private String direction;
	static final String java="java方向";
	static final String test="测试方向";
	static final String andriod="andriod方向";
	public Teacher(){
		
	}
	public Teacher(String name,int age){
		this.name = name;
		this.age = age;
		this.sex ="男";
		this.direction="软件工程";		
	}
	public Teacher(String name, int age, String sex, String direction) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.direction = direction;
	}
	public void show(){
		System.out.println("大家好，我叫"+getName()+",我今年"+getAge()+"岁,性别"+getSex()+",我主要的技术方向是"+getDirection());
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
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	
}
