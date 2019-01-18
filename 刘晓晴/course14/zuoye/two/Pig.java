package course14;

public class Pig {
	private String name;
	private int health=100;
	private int love=80;
	private String color;
	public Pig(){
		
	}
	public Pig(String name,String color){
		this.name=name;
		this.color=color;
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
	public void show(){
		System.out.println("宠物自白：");
		System.out.println("我的名字叫"+getName()+",健康值是"+getHealth()+",和主人的亲密度是"+getLove()+",我的毛发颜色是"+getColor());
	}
}
