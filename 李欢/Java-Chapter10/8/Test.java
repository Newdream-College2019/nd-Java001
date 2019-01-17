package chapter10;

public class Test {
	public static void main(String[] args) {
		Hero hero=new Hero();
		hero.name="程咬金";
		hero.life=2000;
		Monster mon=new Monster();
		mon.name="史瑞克";
		mon.life=2000;
		Weapon wea=new Weapon();
		wea.name="大炮";
		wea.atk=1000;
		hero.show();
		mon.show();
		wea.show();

	}

}
