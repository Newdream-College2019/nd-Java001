package chapter17;

public class TelTest {
	public static void main(String[] args) {
		G502c g=new G502c();
		System.out.println("这是一款型号为G502c的索尼爱立信手机：");
		g.music();
		g.mess();
		g.call();
		Note n=new Note();
		System.out.println("\n这是一款型号为红米Note的小米手机：");
		n.surf();
		n.video();
		n.photo();
		n.mess();
		n.call();
	}
}
