package chapter13_2;

public class Customer {
	public void information(String name,int age,boolean yn){
		System.out.println(name+"\t"+age+"\t"+yn);
	}
	public static void main(String[] args) {
		System.out.println("�ͻ���Ϣ��");
		String name;
		int age;
		boolean yn;
		Customer cus=new Customer();
		cus.information("��һ", 30, false);
		cus.information("��ǿ", 19, true);
	}
}
