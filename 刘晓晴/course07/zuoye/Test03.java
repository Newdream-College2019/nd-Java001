public class Test03{
	public static void main(String[] args){
		int sum=0;
		int temp=1;
		for (int i=1;i<10;i++){
			sum=(temp+1)*2;
			temp=sum;
		}
		System.out.println("×î³õÓÐ"+sum+"¸öÔæ");
	}

}