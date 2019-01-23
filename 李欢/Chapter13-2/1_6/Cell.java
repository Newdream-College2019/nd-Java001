package chapter13_2;

public class Cell {
	String brand;
	int gl;
	String type;
	public void chong(){
		System.out.println("某某品牌的电池正在充电");
	}
	public void fang(){
		System.out.println("某某品牌的电池正在放电");
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
		return "品牌：" + brand + "\n功率：" + gl + "\n型号：" + type ;
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
