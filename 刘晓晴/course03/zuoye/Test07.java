import java.util.*;
public class Test07{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("我行我素购物管理系统>幸运抽奖");
		System.out.println();
		System.out.print("请输入4位会员号：");
		int num=input.nextInt();
		Random rd=new Random();
		int a=rd.nextInt(10);
		int b=num/100%10;
		if(a==b){
			System.out.println(num+"号客户是幸运客户，获得精美Mp3一个");
		}else{
			System.out.println(a+"\t"+num+"号客户,谢谢您的支持");
		}
	}

}