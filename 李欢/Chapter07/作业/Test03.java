public class Test03{
	public static void main(String[] args){
		//10 1
		//9  (1+1)*2=4
		//8	(4+1)*2=10
		//7	(10+1)*2=22
	int sum=0;
	int count=1;
	for(int i=1;i<10;i++){
			sum=(count+1)*2;
			count=sum;
		}
	System.out.println("最初有"+sum+"个枣子");
	}
}