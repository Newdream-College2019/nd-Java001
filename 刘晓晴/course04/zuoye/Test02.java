import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("���������������:");
		int num=input.nextInt();
		if(num<3&&num>0){
			System.out.println("����"+num);
		}else if(num>=3&&num<5){
			num=num+1;
			System.out.println("����"+num);
		}else{
			num=num+2;
			System.out.println("����"+num);
		}

	}
}