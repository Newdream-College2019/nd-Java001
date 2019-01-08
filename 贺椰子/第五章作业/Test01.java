public class Test01
{
	public static void main(String[] args) 
	{
		int a=1;
		int b=1;
		int i=0;
		while(i<10){
			System.out.println(a+"  "+b);
			a=a+b;
			b=a+b;
			i++;
		}
	}
}
