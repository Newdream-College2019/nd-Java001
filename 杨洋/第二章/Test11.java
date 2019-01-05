import java.util.Scanner;
public class Test11{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("ÇëÊäÈëa,b,cµÄÖµ£º");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int d;
		if(a<b){
			d=a;
			a=b;
			b=d;
		}
		if(a<c){
			d=a;
			a=c;
			c=d;
		}
		if(b<c){
			d=b;
			b=c;
			c=d;
		}
		System.out.println(a+"\t"+b+"\t"+c);
	}
}