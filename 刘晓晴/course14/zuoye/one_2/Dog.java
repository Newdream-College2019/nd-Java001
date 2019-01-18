package course14;

public class Dog {
	private String name;
	private int health=100;
	private int love=80;
	private String strain;
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return this.health;
	}
	public void setHealth(int health) {
		if(health>0&&health<=100){
			this.health = health;
		}else{
			System.out.println("ÊäÈë´íÎó");
		}
	}
	public int getLove() {
		return this.love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	public String getStrain() {
		return this.strain;
	}
	public void setStrain(String strain) {
		this.strain = strain;
	}
}
