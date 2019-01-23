package chapter13_2;

public class Customer {
	public void information(String name,int age,boolean yn){
		System.out.println(name+"\t"+age+"\t"+yn);
	}
	public static void main(String[] args) {
		System.out.println("客户信息：");
		String name;
		int age;
		boolean yn;
		Customer cus=new Customer();
		cus.information("王一", 30, false);
		cus.information("郝强", 19, true);
	}
}
