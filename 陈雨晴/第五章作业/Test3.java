public class Test3{
	public static void main(String[] args){
		int i=100;
		while(i>=5){
			System.out.print(i);
			if(i!=5)
				System.out.print("¡¢");
			else System.out.print("¡£");
			i=i-5;
		}
	}
}