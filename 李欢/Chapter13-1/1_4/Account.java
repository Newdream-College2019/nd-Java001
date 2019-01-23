package chapter13_1;

import java.util.Scanner;

public class Account {
	Scanner input=new Scanner(System.in);
	double sum=0;
	public void save(int cun){
		System.out.print("请输入存款金额：");
		cun=input.nextInt();
		System.out.println("存款成功");
		sum+=cun;
		System.out.println("\n***当前余额为："+sum+"***");
	}
	public void get(int qu){
		System.out.print("请输入取款金额：");
		qu=input.nextInt();
		System.out.println("取款成功");
		sum-=qu;
		System.out.println("\n***当前余额为："+sum+"***");
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Account ac=new Account();
		int num;
		int cun=0;
		int qu=0;
		do{
			System.out.println("1.存款2.取款0.退出");
			System.out.print("请选择你需要办理的业务：");
			num=input.nextInt();
			if(num==1){
				ac.save(cun);
			}else if(num==2){
				ac.get(qu);
			}else if(num==0){
				System.out.println("谢谢使用！");
			}
			else {
				System.out.println("输入有误！");
			}
		}while(num!=0);
		
	}
}
