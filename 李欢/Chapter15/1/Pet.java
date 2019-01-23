package chapter15;

public abstract class Pet {
	String name="无名氏";
	int health=100;
	int love=80;
	public Pet() {
	}
	public Pet(String name) {
		this.name = name;
	}
	public abstract void print();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		if(health<=100&&health>=1){
			this.health = health;
		}else{
			System.out.println("健康值范围应为1~100");
		}
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}	 
}
