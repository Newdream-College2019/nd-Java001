import java.util.Scanner;
import java.util.Random;
public class Test06{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
	do{
		System.out.println("������һ��0��2֮�������:");
		int num=input.nextInt();
		Random ran=new Random();
		int  rd=ran.nextInt(3);
		System.out.println(rd);
		if(num==0){
			if(rd==0){
				System.out.println("�������ʯͷ,����ƽ��");
			}
			else if(rd==1){
				System.out.println("�������ʯͷ,������Ӯ��");
			}else{
				System.out.println("�������ʯͷ,����������");
			}
		}

		else if(num==1){
			if(rd==1){
				System.out.println("������Ǽ���,����ƽ��");
			}
			else if(rd==2){
				System.out.println("������Ǽ���,������Ӯ��");
			}
			else{
				System.out.println("������Ǽ���,����������");
			}
		}
		else if(num==2){
			if(rd==2){
			System.out.println("������ǲ�,����ƽ��");
		}
			else if(rd==0){
			System.out.println("������ǲ�,������Ӯ��");
			}
			else{
			System.out.println("������ǲ�,����������");
			}
		}
		else{
			System.out.println("�������󣬳������");
			break;
		}
	}while(true);
	}
}