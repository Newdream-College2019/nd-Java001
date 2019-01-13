public class Test04{
	public static void main(String[] args){
		int sum=0;
		for(int i=1;i<=10;i++){
			int num=1;
			for(int j=1;j<=i;j++){
				num=num*j;
			}
			sum+=num;
		}
		System.out.println("1!+2!+3!+4!+5!+6!+7!+8!+9!+10!µÄºÍÎª£º"+sum);
	}
}