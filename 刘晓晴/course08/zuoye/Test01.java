public class Test01{
	public static void main(String[] args){
		int sum=0;
		for(int i=1;i<=100;i++){
			sum+=i;
			if(sum>500){
				System.out.println("此时，加到"+i+",和为"+sum);
				break;
			}
		}
	}
}