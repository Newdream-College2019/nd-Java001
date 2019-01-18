package course13.zuoye;

public class TestBattery {
	public static void main(String[] args) {
		Battery b=new Battery();
		b.brand="ÄÏæÚ";
		b.power=100;
		b.type="1.0";
		b.chD();
		b.fD();
		System.out.println(b.pinP());
		System.out.println(b.gongL());
		System.out.println(b.xingH());
		System.out.println(b.toString());
		b.pinP("ÄÏæÚ");
		b.gongL(100);
		b.xingH("1.0");
	}
}
