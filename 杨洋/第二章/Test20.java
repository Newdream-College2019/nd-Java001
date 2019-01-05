import java.util.Scanner;
import java.util.Random;
public class Test20{
	public static void main(String[] args){
		Random rd=new Random();
		Scanner input=new Scanner(System.in);
		System.out.println("我行我素购物管理系统>幸运抽奖");
		System.out.println("请输入4位会员号：");
		int num = rd.nextInt(10);
		System.out.println(num);
		int a=input.nextInt();
		if((a%1000)/100==num){
			System.out.println(a+"号客户是幸运客户，获得精美MP3一个");
		}
		else if(a%1000/100!=(num)){
			System.out.println(a+"号客户，谢谢您的支持");
		}
	}
}