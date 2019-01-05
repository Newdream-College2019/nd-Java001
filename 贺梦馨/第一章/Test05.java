public class Test05{
	public static void main(String[] args){
		int a=1234;
		int b=a%10;
		int c=a/10%10;
		int d=a/100%10;
		int e=a/1000;
		System.out.println("个位数是"+b+"十位数是"+c+"百分数是"+d+"千位数是"+e);
}
}