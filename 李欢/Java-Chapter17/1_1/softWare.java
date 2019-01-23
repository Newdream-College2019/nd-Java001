package chapter17;

public class softWare implements Write,Speak{

	@Override
	public void write() {
		System.out.println("我会写代码。");
	}

	@Override
	public void speak() {
		System.out.println("我会讲业务。");	
	}
	public static void main(String[] args) {
		softWare sw=new softWare();
		System.out.println("我是一名软件工程师，我的名字叫小明。");
		sw.write();
		sw.speak();
	}
}
