package course14;

public class Dog {
	private String name;
	private int health=100;
	private int love=80;
	private String strain;
	public Dog(){
		
	}
	public Dog(String name,String strain){
		this.name=name;
		this.strain=strain;
	}
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
			System.out.println("输入错误");
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
	public void show(){
		System.out.println("宠物自白：");
		System.out.println("我的名字叫"+getName()+",健康值是"+getHealth()+",和主人的亲密度是"+getLove()+",我是一只聪明的"+getStrain());
	}
}
