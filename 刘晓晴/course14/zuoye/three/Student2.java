package course14;

public class Student2 {
	private String name;
	private int age;
	private String sex;
	private String career;
	public Student2(String name,int age){
		this.name=name;
		this.age=age;
		this.sex="��";
		this.career="�������";
	}
	public Student2(String name,int age,String sex,String career){
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.career=career;
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
	public String getCareer() {
		return career;
	}
	public void setCareer(String career) {
		this.career = career;
	}
	public void show(){
		System.out.println("��Һã��ҽ�"+name+",�Ա�"+sex+",����"+age+"��,רҵ��"+career);
	}
}
