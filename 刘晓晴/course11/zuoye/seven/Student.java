package course11;

public class Student {
	String name;
	int num;
	String clazz;
	String  sex;
	int age;
	String address;
	public String sayHello(){
		return "姓名:"+name+"\n学号:"+num+"\n班级:"+clazz+"\n性别:"+sex+"\n年龄:"+age+"\n家庭住址:"+address;
	}
	public static void main(String[] args) {
		Student stu=new Student();
		stu.name="lili";
		stu.num=22;
		stu.clazz="计科一班";
		stu.age=20;
		stu.sex="女";
		stu.address="长沙";
		System.out.println(stu.sayHello());
	}
}
