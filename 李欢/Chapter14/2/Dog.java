package chapter14;

public class Dog {
	 String name="������";
	 int health=100;
	 int love=80;
	 String strain="��������������Ȯ";
	public Dog(){
		 
	}
	public Dog(String name, String strain) {
		this.name=name;
		this.strain=strain;
	}
	public void print(String name,String strain){
		System.out.println("������԰ף�");
		System.out.println("�ҵ����ֽ�"+name+"������ֵ��"+health+"�������˵����ܶ���"+love+"������һֻ"+strain);
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
				System.out.println("����ֵ��ΧӦΪ1~100");
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
