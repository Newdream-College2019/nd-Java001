package chapter15;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String no;
		String brand = null;
		String type;
		int seatCount;
		int days=0;
		int rent=0;
		System.out.println("��ӭ�������������޹�˾��");
		Scanner input=new Scanner(System.in);
		System.out.print("�������⳵������");
		days=input.nextInt();
		System.out.print("������Ҫ���޵��������ͣ�1���γ�  2���ͳ�����");
		int choice=input.nextInt();
		Car car=new Car();
		Bus bus=new Bus();
		if(choice==1){
			System.out.print("������Ҫ���޵�������Ʒ�ƣ�1������  2����ˣ���");
			choice=input.nextInt();
			if(choice==1){
				System.out.print("1��550i");
				brand="����";
			}else{
				brand="���";
				System.out.print("������γ����ͺţ�");
				System.out.print("2�������GL8  3��������");
				choice=input.nextInt();
			}
			if (choice==1){
				type="550i";
			}else if(choice==2){
				type="�����GL8";
			}else{
				type="������";
			}
				no="��BK5543";
				System.out.println("\n��������������ƺ��ǣ�"+no);
				car.setNo(no);
				car.setBrand(brand);
				car.setType(type);
				System.out.println("\n�˿����ã�����Ҫ֧�������޷�����"+car.CalcRent(days));
		}else if(choice==2){
			System.out.print("������Ҫ���޵Ŀͳ����ͣ�1����  2����������");
			choice=input.nextInt();
			if(choice==1){
				brand="��";
				System.out.print("������ͳ�����λ����1��<=16��  2��>16����");
			}else if (choice==2){
				brand="����";
				System.out.print("������ͳ�����λ����1��<=16��  2��>16����");
			}
			int num=input.nextInt();
			if(num==1){
				seatCount=16;
			}else {
				seatCount=20;
			}
			no="��BK5543";
			System.out.println("��������������ƺ��ǣ�"+no);
			bus.setNo(no);
			bus.setBrand(brand);
			bus.setSeatCount(seatCount);
			System.out.println("\n�˿����ã�����Ҫ֧�������޷�����"+bus.CalcRent(days));
		}else{
			System.out.println("�������");
		}

	}

}
