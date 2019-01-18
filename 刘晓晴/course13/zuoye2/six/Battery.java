package course13.zuoye;

public class Battery {
	String brand;
	int power;
	String type;
	public void chD(){
		System.out.println("南孚品牌的电池正在充电");
	}
	public void fD(){
		System.out.println("南孚品牌的电池正在放电");
	}
	public String pinP(){
		return brand;
	}
	public int gongL(){
		return power;
	}
	public String xingH(){
		return type;
	}
	public String toString(){
		return "电池品牌:"+brand+"\n电池功率:"+power+"\n电池型号："+type;
	}
	public void pinP(String brand){
		this.brand=brand;
		System.out.println(this.brand);
	}
	public void gongL(int power){
		this.power=power;
		System.out.println(this.power);
	}
	public void xingH(String type){
		this.type=type;
		System.out.println(this.type);
	}
}
