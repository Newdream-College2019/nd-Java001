import java.util.Scanner;
import java.util.Random;
public class Test07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random re = new Random();
		System.out.println("我行我素购物管理系统 > 幸运抽奖\n");
		System.out.print("请输入四位会员号：");
		int num = in.nextInt();
		int suiji = re.nextInt(11);
		if(num/100%10==suiji){
			System.out.println(num+"是幸运用户，获得精美MP3一个！");
		}else{
			System.out.println(num+"号客户，谢谢您的支持！");
			}
	}
}
