import java.util.Scanner;
public class Test05{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	
	do{
		System.out.println("请输入一个0到2之间的整数:");
	int num=input.nextInt();
		if(num==0){
			System.out.println("你出的是石头");
		}
		else if(num==1){
			System.out.println("你出的是剪刀");
		}
		else if(num==2){
			System.out.println("你出的是布");
		}
		else{
			System.out.println("输入有误，程序结束");
			break;
		}
	}while(true);

	}
}