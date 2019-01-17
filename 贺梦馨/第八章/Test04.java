public class Test04{
	public static void main(String[] args){
		int sum=0,num=0;
		for(int i=1;i<=10;i++){
			for(int j=i;j<0;j--){
				num+=j;
				
			}
		sum+=num;
		}
		System.out.print("1£¡+10£¡="+sum);
	}
}