package chapter11;

public class Student {
	String name;
	int num;
	String grade;
	String sex;
	int age;
	String address;
	public String sayHello(){
		return "������"+name+"\nѧ�ţ�"+num+"\n�༶��"+grade+"\n�Ա�:"+sex+"\n����:"+age+"\n��ͥסַ��"+address;
	}
	public static void main(String[] args) {
		Student stu=new Student();
		stu.name="�";
		stu.num=16;
		stu.grade="�ƿ�һ��";
		stu.sex="Ů";
		stu.age=20;
		stu.address="��ɳ";
		System.out.println(stu.sayHello());
		
	}
}
