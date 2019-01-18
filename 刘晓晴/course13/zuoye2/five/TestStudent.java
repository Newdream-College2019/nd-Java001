package course13.zuoye;

public class TestStudent {

	public static void main(String[] args) {
		Student stu=new Student();
		stu.name="lili";
		stu.age=20;
		stu.sex="女";
		System.out.println(stu.toString());
		System.out.println(stu.getName());
		stu.setName("limei");
		System.out.println(stu.getSex());
		stu.setSex("男");
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
			System.out.println("\n这一只鸡成功换回一只鸭");
		}else{
			System.out.println("这一只鸡不能换回一只鸭");
		}
	}

}
