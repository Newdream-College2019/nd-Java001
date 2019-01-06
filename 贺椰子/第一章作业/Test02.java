public class Test02{
	public static void main(String[] args){
		int a1=5;
		double a2=6.9;
		System.out.println("a1="+a1+","+"a2="+a2);
		String s="小李";
		char c='a';
		System.out.println("s="+s+","+"c="+c);

		//交换两个变量的值
		//方法一（定义变量）
		int a=3;
		int b=5;
		System.out.println("定义变量交换前：a="+a+"\tb="+b);
		int t;
		t=a;
		a=b;
		b=t;
		System.out.println("交换后a="+a+"\tb="+b+"\n");

		//方法二（不定义变量）
		int aa=3;
		int bb=5;
		System.out.println("不定义变量交换前：aa="+aa+"\tbb="+bb);
		aa=aa+bb;
		bb=aa-bb;
		aa=aa-bb;
		System.out.println("交换后：aa="+aa+"\tbb="+bb);

		//1234取出各个数字
		int sum=1234;
		int ge=sum%10;
		int shi=sum/10%10;
		int bai=sum/100%10;
		int qian=sum/1000;
		System.out.println("ge="+ge+"\nshi="+shi+"\nbai="+bai+"\nqian="+qian);

	}

}