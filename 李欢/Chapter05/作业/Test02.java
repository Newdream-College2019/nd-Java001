public class Test02{
	public static void main(String[] args){
		double  sum=0;
		double i=1;
		do{
			sum=sum+1/(i*i);
			i++;
		}while(i<=20);
		System.out.println(sum);
	}
}