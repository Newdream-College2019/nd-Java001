public class Test01{
	public static void main(String[] args){
		int sum=0;
		for (int i=1;i<100;i+=2){
			sum+=i;
		}
		System.out.println("100以内的奇数和："+sum);
	}
}