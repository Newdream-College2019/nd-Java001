package course14;

public class TeacherTest {
	public static void main(String[] args) {
		Teacher t=new Teacher();
		Teacher t1=new Teacher("����",30);
		t1.show();
		
		Teacher t2=new Teacher("����","��",35,t.testD);
		t2.show();
	}
}
