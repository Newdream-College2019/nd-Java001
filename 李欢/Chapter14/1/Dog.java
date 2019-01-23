package chapter14;

public class Dog {
	 String name="无名氏";
	 int health=100;
	 int love=80;
	 String strain="聪明的拉布拉多犬";
	public Dog(){
		 
	}
	public Dog(String name, String strain) {
		this.name=name;
		this.strain=strain;
	}
	public void print(String name,String strain){
		System.out.println("宠物的自白：");
		System.out.println("我的名字叫"+name+"，健康值是"+health+"，和主人的亲密度是"+love+"，我是一只"+strain);
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
	public String getStrain() {
		return strain;
	}
	public void setStrain(String strain) {
		this.strain = strain;
	}
	
	
}
