package course13.zuoye;

import java.util.*;

public class Account {
	Scanner input=new Scanner(System.in);
	public void index(double sum){
		System.out.println("1.存款 2.取款 0.退出");
		System.out.print("请选择你需要办理的业务：");
		int num=input.nextInt();
		if(num==1){
			cun(sum);
		}else if(num==2){
			qu(sum);
		}else if(num==0){
			System.out.println("谢谢使用！");
			System.exit(0);
		}else{
			System.out.println("输入错误");
		}
	}
	public void cun(double sum){
		System.out.print("请输入存款金额：");
		int money=input.nextInt();
		System.out.println("存款成功");
		sum+=money;
		System.out.println("\n*****当前余额为："+sum+"元****\n");
		index(sum);
	}
	public void qu(double sum){
		System.out.print("请输入取款金额：");
		int money=input.nextInt();
		if(money<=sum){
			System.out.println("取款成功");
			sum-=money;
			System.out.println("\n*****当前余额为："+sum+"元****");
			index(sum);
		}else{
			System.out.println("存款不足！");
		}
		
	}
}
