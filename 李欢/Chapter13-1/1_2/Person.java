package chapter13_1;

public class Person {
	public void show(String name,String sex,int age){
		System.out.println("����-->"+name);
		System.out.println("�Ա�-->"+sex);
		System.out.println("����-->"+age);
	}
	public static void main(String[] args) {
		System.out.println("-------------------��Ա��Ϣ-----------------------");
		System.out.println("��Ա��Ϣ���£�");
		Person per=new Person();
		per.show("����","��",18);
		
	}
}
