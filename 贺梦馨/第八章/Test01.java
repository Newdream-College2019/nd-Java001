public class Test01{
	public static void main(String[] args){
		int i;
		int sum=0;
		for(i=1;i<=100;i++){
			sum+=i;
			if(sum>500){
				break;
			}
		}
		System.out.print("从1到"+i+"的和为"+sum);
	}
}