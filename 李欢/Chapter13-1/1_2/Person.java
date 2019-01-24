package chapter13_1;

public class Person {
	public void show(String name,String sex,int age){
		System.out.println("姓名-->"+name);
		System.out.println("性别-->"+sex);
		System.out.println("年龄-->"+age);
	}
	public static void main(String[] args) {
		System.out.println("-------------------人员信息-----------------------");
		System.out.println("人员信息如下：");
		Person per=new Person();
		per.show("张三","男",18);
		
	}
}
