import java.util.Scanner;
import java.util.Random;
public class Test06{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
	do{
		System.out.println("请输入一个0到2之间的整数:");
		int num=input.nextInt();
		Random ran=new Random();
		int  rd=ran.nextInt(3);
		System.out.println(rd);
		if(num==0){
			if(rd==0){
				System.out.println("你出的是石头,本局平局");
			}
			else if(rd==1){
				System.out.println("你出的是石头,本局你赢了");
			}else{
				System.out.println("你出的是石头,本局你输了");
			}
		}

		else if(num==1){
			if(rd==1){
				System.out.println("你出的是剪刀,本局平局");
			}
			else if(rd==2){
				System.out.println("你出的是剪刀,本局你赢了");
			}
			else{
				System.out.println("你出的是剪刀,本局你输了");
			}
		}
		else if(num==2){
			if(rd==2){
			System.out.println("你出的是布,本局平局");
		}
			else if(rd==0){
			System.out.println("你出的是布,本局你赢了");
			}
			else{
			System.out.println("你出的是布,本局你输了");
			}
		}
		else{
			System.out.println("输入有误，程序结束");
			break;
		}
	}while(true);
	}
}