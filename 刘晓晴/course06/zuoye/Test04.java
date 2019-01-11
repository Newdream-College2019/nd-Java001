public class Test04{
	public static void main(String[] args){
		for(int i=10000;i<=99999;i++){
			int a=i/10000;
			int b=i/1000%10;
			int c=i/100%10;
			int d=i/10%10;
			int e=i%10;
			if(a==e&&b==d){
				System.out.println(i+"是回文数");
			}
		}
	}
}