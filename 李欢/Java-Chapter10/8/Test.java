package chapter10;

public class Test {
	public static void main(String[] args) {
		Hero hero=new Hero();
		hero.name="��ҧ��";
		hero.life=2000;
		Monster mon=new Monster();
		mon.name="ʷ���";
		mon.life=2000;
		Weapon wea=new Weapon();
		wea.name="����";
		wea.atk=1000;
		hero.show();
		mon.show();
		wea.show();

	}

}
