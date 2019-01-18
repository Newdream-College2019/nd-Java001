package course13.zuoye;

public class TestStudent {

	public static void main(String[] args) {
		Student stu1=new Student();
		stu1.Java=80;
		stu1.C=85;
		stu1.SQL=90;
		
		Student stu2=new Student();
		stu2.Java=80;
		stu2.C=80;
		stu2.SQL=80;
		
		StudentBiz sb=new StudentBiz();
		System.out.println("第一位同学的平均成绩："+sb.getAvg(stu1));
		System.out.println("第一位同学的平均成绩："+sb.getAvg(stu2));
	}

}
