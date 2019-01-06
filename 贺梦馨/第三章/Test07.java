import java.util.Scanner;
public class Test07{
	public shatic void main(String[] args){
		System.out.println("请输入您的会员码");
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		int b=number/100%10
		int x=(int)Math.random(10);
		if(b==x){
		System.out.println("恭喜！您是幸运会员！");
		}else{
		System.out.println("很遗憾，您不是幸运会员！");
		}
	}
}