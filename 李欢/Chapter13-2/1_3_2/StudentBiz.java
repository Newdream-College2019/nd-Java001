package chapter13_2;

public class StudentBiz {
	public double getAvg(Student stu){
		return (stu.Java+stu.C+stu.SQL)/3.0;
	}
	public static void main(String[] args) {
		StudentBiz biz=new StudentBiz();
		Student stu=new Student();
		stu.C=74;
		stu.Java=78;
		stu.SQL=57;
		System.out.println("��ͬѧ3�ſε�ƽ����Ϊ��"+biz.getAvg(stu));
	}
}
