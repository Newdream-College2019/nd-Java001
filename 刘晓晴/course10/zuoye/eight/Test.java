package course10;

public class Test {
	public static void main(String[] args){
		Hero hero=new Hero();
		hero.name="Â³°à";
		hero.life=900;
		
		Monster monster=new Monster();
		monster.name="´óÁú";
		monster.life=1500;
		
		Weapon weapon=new Weapon();
		weapon.name="»ğÅÚ";
		weapon.atk=80;
		
		hero.show();
		monster.show();
		weapon.show();
	}
}
