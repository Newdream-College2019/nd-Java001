import java.util.Scanner;
public class Test04{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int i=1;
		while(i==1){
			System.out.print("你的名字叫什么？：");
			String name=in.next();
			if(!name.equals("不告诉你")){
				System.out.print("你的名字原来叫"+name);
				i=0;
			}else{
				i=1;
			}
		}
	}
}
