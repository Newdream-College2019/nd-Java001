package course11;

public class Student {
	String name;
	int num;
	String clazz;
	String  sex;
	int age;
	String address;
	public String sayHello(){
		return "����:"+name+"\nѧ��:"+num+"\n�༶:"+clazz+"\n�Ա�:"+sex+"\n����:"+age+"\n��ͥסַ:"+address;
	}
	public static void main(String[] args) {
		Student stu=new Student();
		stu.name="lili";
		stu.num=22;
		stu.clazz="�ƿ�һ��";
		stu.age=20;
		stu.sex="Ů";
		stu.address="��ɳ";
		System.out.println(stu.sayHello());
	}
}
