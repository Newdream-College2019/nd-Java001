public class Test04{
	public static void main(String[] args){
		for(int i=10000;i<=99999;i++){
			int w=i/10000%10;
			int q=i/1000%10;
			int s=i/10%10;
			int g=i%10;
			if(w==g&&s==q){
				System.out.println(i+"是回文数");
			}
		}
	}
}