package course13.zuoye;

public class TestStudent {

	public static void main(String[] args) {
		Student stu=new Student();
		stu.name="lili";
		stu.age=20;
		stu.sex="Ů";
		System.out.println(stu.toString());
		System.out.println(stu.getName());
		stu.setName("limei");
		System.out.println(stu.getSex());
		stu.setSex("��");
		int arr[]={1,3,2,4,5};
		System.out.println(stu.shuZu(arr));
		System.out.println(stu.ji(5));
		System.out.println(stu.zhiShu(5));
		System.out.println(stu.minBs(12,8));
		System.out.println(stu.maxYs(12,8));
		System.out.println(stu.num(4));
		int[] brr=stu.yXu(arr);
		for(int i=0;i<brr.length;i++){
			System.out.print(brr[i]+" ");
		}
		Chicken ch=new Chicken();
		if(stu.exchange(ch)!=null){
			System.out.println("\n��һֻ���ɹ�����һֻѼ");
		}else{
			System.out.println("��һֻ�����ܻ���һֻѼ");
		}
	}

}
