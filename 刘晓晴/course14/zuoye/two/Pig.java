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
		System.out.println("�����԰ף�");
		System.out.println("�ҵ����ֽ�"+getName()+",����ֵ��"+getHealth()+",�����˵����ܶ���"+getLove()+",�ҵ�ë����ɫ��"+getColor());
	}
}
