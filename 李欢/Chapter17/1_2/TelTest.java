package chapter17;

public class TelTest {
	public static void main(String[] args) {
		G502c g=new G502c();
		System.out.println("����һ���ͺ�ΪG502c�����ᰮ�����ֻ���");
		g.music();
		g.mess();
		g.call();
		Note n=new Note();
		System.out.println("\n����һ���ͺ�Ϊ����Note��С���ֻ���");
		n.surf();
		n.video();
		n.photo();
		n.mess();
		n.call();
	}
}
