package chapter15;

public class Dog extends Pet {
	private String strain="聪明的拉布拉多犬";
	public Dog(){
		 
	}
	public Dog(String name, String strain) {
		this.name=name;
		this.strain=strain;
	}
	public void print(){
		System.out.println("宠物的自白：");
		System.out.println("我的名字叫"+getName()+"，健康值是"+getHealth()+"，和主人的亲密度是"+getLove()+"，我是一只"+getStrain());
	}
	public String getStrain() {
		return strain;
	}
	public void setStrain(String strain) {
		this.strain = strain;
	}
	
	
}
