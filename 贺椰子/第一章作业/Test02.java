public class Test02{
	public static void main(String[] args){
		int a1=5;
		double a2=6.9;
		System.out.println("a1="+a1+","+"a2="+a2);
		String s="С��";
		char c='a';
		System.out.println("s="+s+","+"c="+c);

		//��������������ֵ
		//����һ�����������
		int a=3;
		int b=5;
		System.out.println("�����������ǰ��a="+a+"\tb="+b);
		int t;
		t=a;
		a=b;
		b=t;
		System.out.println("������a="+a+"\tb="+b+"\n");

		//�������������������
		int aa=3;
		int bb=5;
		System.out.println("�������������ǰ��aa="+aa+"\tbb="+bb);
		aa=aa+bb;
		bb=aa-bb;
		aa=aa-bb;
		System.out.println("������aa="+aa+"\tbb="+bb);

		//1234ȡ����������
		int sum=1234;
		int ge=sum%10;
		int shi=sum/10%10;
		int bai=sum/100%10;
		int qian=sum/1000;
		System.out.println("ge="+ge+"\nshi="+shi+"\nbai="+bai+"\nqian="+qian);

	}

}