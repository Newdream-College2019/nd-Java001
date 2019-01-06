import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		int i=1;
		double sum=0;
		while(i<=20){
			sum+=1.0/(i*i);
			i++;
		}
		System.out.println("sum="+sum);

	}
}