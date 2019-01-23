import java.util.Scanner;
public class Test07{
	public shatic void main(String[] args){
		System.out.println("请依次输入a,b,c的值");
		Scanner input=new Scanner(System.in);
		double a=input.nextDouble();
		double b=inut.nextDouble();
		double c=input.nextDouble();
		if(a>b){
			if(a>c){
				if(b>c){
				System.out.println(a+">"+b+">"+c);
					}else{double d;
				d=c;
				c=b;
				b=d;
				System.out.println(a+">"+b+">"+c);}
			}else{double d;
				d=c;
				c=b;
				b=d;
				System.out.println(a+">"+b+">"+c);}
		}else if(b>c){
				if(a>c){
				double d;
				d=a;a=b;b=d;
				System.out.println(a+">"+b+">"+c);
				}else{double d;
				d=a;
				a=c;
				c=b;
				b=a;
				System.out.println(a+">"+b+">"+c);
			}
		}

}
}