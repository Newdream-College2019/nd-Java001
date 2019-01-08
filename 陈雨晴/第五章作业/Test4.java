import java.util.Scanner;
public class Test4{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int i=1;
		String answer;
		System.out.println("你的名字叫什么：");
		while(i==1){			
			answer=input.next();
			if(answer.equals("不告诉你")){
				System.out.println("你的名字叫什么：");
			}else {
				System.out.println("你的名字原来叫："+answer);
				break;
			}

		}		
	}
}