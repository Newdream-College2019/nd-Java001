package chapter13_2;

public class Cell {
	String brand;
	int gl;
	String type;
	public void chong(){
		System.out.println("ĳĳƷ�Ƶĵ�����ڳ��");
	}
	public void fang(){
		System.out.println("ĳĳƷ�Ƶĵ�����ڷŵ�");
	}
	public String brand(){
		return brand;
	}
	public int gong(){
		return gl;
	}
	public String type(){
		return type;
	}
	@Override
	public String toString() {
		return "Ʒ�ƣ�" + brand + "\n���ʣ�" + gl + "\n�ͺţ�" + type ;
	}
	public void brand(String brand){
		this.brand=brand;
		System.out.println(this.brand);
	}
	public void gong(int gl){
		this.gl=gl;
		System.out.println(this.gl);
	}
	public void type(String type){
		this.type=type;
		System.out.println(this.type);
	}
	
}
