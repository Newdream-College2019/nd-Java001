public class Test02{
	public static void main(String[] args){
		System.out.println("\t\t\tFilepFlop");
		for(int i=1;i<=100;i++){
			if(i%3==0&&i%5==0){
				System.out.println(i+"即是3的倍数也是5的倍数，输出：FlipFlop");
			}
			else if(i%3==0){
				System.out.println(i+"是3的倍数，输出：Flip");
			}
			else if(i%5==0){
				System.out.println(i+"是5的倍数，输出：Flop");
			}
			else{
				System.out.println("当前数字为"+i);}
		}
	}
}