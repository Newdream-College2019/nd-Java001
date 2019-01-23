package chapter14;

public class Pig {
	 String name="无名氏";
	 int health=100;
	 int love=80;
	 String color;
	public Pig(){
		 
	 }
	public Pig(String name, int health, int love, String color) {
		this.name = name;
		this.health = health;
		this.love = love;
		this.color = color;
	}
	public void print(String name,String color) {
		System.out.println("宠物的自白：");
		System.out.println("我的名字叫"+name+"，健康值是"+health+"，和主人的亲密度是"+love+"，我的毛发颜色是"+color+"色");
	}
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
		this.health = health;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	 
}
