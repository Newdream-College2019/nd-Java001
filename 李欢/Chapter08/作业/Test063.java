public class Test063{
	public static void main(String[] args){
		int kg=0;
		int xx=4;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=xx;j++){
				System.out.print("*");
			}
			for(int j=1;j<=kg;j++){
				System.out.print(" ");
			}
			kg++;
			xx--;
		System.out.println("\n");
		}
	}
}