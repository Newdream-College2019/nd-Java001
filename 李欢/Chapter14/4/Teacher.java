package chapter14;

public class Teacher {
	private String name;
	private int age;
	private String sex;
	private String direction;
	static final String java="java����";
	static final String test="���Է���";
	static final String andriod="andriod����";
	public Teacher(){
		
	}
	public Teacher(String name,int age){
		this.name = name;
		this.age = age;
		this.sex ="��";
		this.direction="�������";		
	}
	public Teacher(String name, int age, String sex, String direction) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.direction = direction;
	}
	public void show(){
		System.out.println("��Һã��ҽ�"+getName()+",�ҽ���"+getAge()+"��,�Ա�"+getSex()+",����Ҫ�ļ���������"+getDirection());
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
