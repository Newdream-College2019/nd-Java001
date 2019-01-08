public class Test08{
	//1-10之间不能被三整除的数之和
	public static void main(String[] args) {
		int s=0;
		for(int i=1;i<=10;i++){
			if(i%3!=0){
				System.out.print(i+"+");
				s+=i;
			}
		}
		System.out.println("\b="+s);
	}
}
