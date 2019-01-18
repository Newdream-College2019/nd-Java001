package course14;

public class Teacher {
	private String name;
	private String sex;
	private int age;
	private String direction;
	static final String javaD="Java方向";
	static final String testD="测试方向";
	static final String androidD="Android方向";
	public Teacher(){
		
	}
	public Teacher(String name,int age){
		this.name=name;
		this.age=age;
		this.sex="男";
		this.direction="软件工程";
	}
	public Teacher(String name,String sex,int age,String direction){
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.direction=direction;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public void show(){
		System.out.println("大家好，我是"+name+",性别"+sex+",今年"+age+"岁，专业是"+direction);
	}
}
