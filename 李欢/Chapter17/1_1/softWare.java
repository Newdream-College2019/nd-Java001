package chapter17;

public class softWare implements Write,Speak{

	@Override
	public void write() {
		System.out.println("�һ�д���롣");
	}

	@Override
	public void speak() {
		System.out.println("�һὲҵ��");	
	}
	public static void main(String[] args) {
		softWare sw=new softWare();
		System.out.println("����һ���������ʦ���ҵ����ֽ�С����");
		sw.write();
		sw.speak();
	}
}
