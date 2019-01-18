package course13.zuoye;

public class TestMath {
	public static void main(String[] args) {
		Math m=new Math();
		System.out.println("6，2两个数中的最大值："+m.max(6,2));
		System.out.println("14的个位数："+m.gw(14));
		System.out.println("2的立方："+m.lf(2));
		System.out.println("1加到5的和："+m.he(5));
	}
}
