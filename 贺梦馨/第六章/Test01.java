public class Test01{
	public static void main(String[] args){
		int sum=0;
		for(int i=1;i<=100;){
			sum+=i;
			i=i+2;
		}
		System.out.print("100以内奇数的和为"+sum);
	}
}