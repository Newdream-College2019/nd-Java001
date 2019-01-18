package course14;

public class TeacherTest {
	public static void main(String[] args) {
		Teacher t=new Teacher();
		Teacher t1=new Teacher("ÀîÀ×",30);
		t1.show();
		
		Teacher t2=new Teacher("ÀîÃ÷","ÄĞ",35,t.testD);
		t2.show();
	}
}
