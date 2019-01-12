public class Test04{
	public static void main(String[] args){
		for(int i=10000;i<=99999;i++){
			int a=i%10;
			int b=i/10%10;
			int a1=i/1000%10;
			int b1=i/10000;
			if(a==a1&&b==b1){
				System.out.println(i);
			}
			
		}
	}
}