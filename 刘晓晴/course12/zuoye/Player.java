package course12;

import java.util.Scanner;

public class Player {
	String name;
	int score;
	public int getChoice(){
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		if(num==1){
			System.out.println("���ȭ������");
		}else if(num==2){
			System.out.println("���ȭ��ʯͷ");
		}else if(num==3){
			System.out.println("���ȭ����");
		}else{
			System.out.println("�������");
		}
		return num;
	}
}
