public class Test09{
	public static void main(String[] args) {
		int s=0;
		for(int i=1;i<=100;i++){
			s+=i;
			if(s>500){
				System.out.println("和大于500时，加到了"+i);
				break;
			}
		}
	}
}