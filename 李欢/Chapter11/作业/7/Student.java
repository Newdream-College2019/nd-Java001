package chapter11;

public class Student {
	String name;
	int num;
	String grade;
	String sex;
	int age;
	String address;
	public String sayHello(){
		return "姓名："+name+"\n学号："+num+"\n班级："+grade+"\n性别:"+sex+"\n年龄:"+age+"\n家庭住址："+address;
	}
	public static void main(String[] args) {
		Student stu=new Student();
		stu.name="李欢";
		stu.num=16;
		stu.grade="计科一班";
		stu.sex="女";
		stu.age=20;
		stu.address="长沙";
		System.out.println(stu.sayHello());
		
	}
}
