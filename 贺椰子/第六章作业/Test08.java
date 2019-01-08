import java.util.Scanner;
public class Test08{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int up=0;
		int down=0;
		for(int i=1;i<=10;i++){
			System.out.print("请输入第"+i+"位顾客的年龄：");
			int age = in.nextInt();
			if(age>=30){
				up++;
			}else{
				down++;
			}
		}
		System.out.println("30岁以上顾客比例是："+up/10.0*100+"%");
		System.out.println("30岁以下顾客比例是："+down/10.0*100+"%");
	}
}
