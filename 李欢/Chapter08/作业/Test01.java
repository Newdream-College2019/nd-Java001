public class Test01{
	public static void main(String[] args){
		int num=0;
		for(int i=1;i<=100;i++){
			num+=i;
			if(num>500){
				System.out.println("累加的和已大于500，此时已经加到"+i);
				break;
			}
		}
	}
}