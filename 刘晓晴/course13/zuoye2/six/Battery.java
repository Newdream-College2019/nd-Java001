package course13.zuoye;

public class Battery {
	String brand;
	int power;
	String type;
	public void chD(){
		System.out.println("����Ʒ�Ƶĵ�����ڳ��");
	}
	public void fD(){
		System.out.println("����Ʒ�Ƶĵ�����ڷŵ�");
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
		return "���Ʒ��:"+brand+"\n��ع���:"+power+"\n����ͺţ�"+type;
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
