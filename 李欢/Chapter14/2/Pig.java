package chapter14;

public class Pig {
	 String name="������";
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
		System.out.println("������԰ף�");
		System.out.println("�ҵ����ֽ�"+name+"������ֵ��"+health+"�������˵����ܶ���"+love+"���ҵ�ë����ɫ��"+color+"ɫ");
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
