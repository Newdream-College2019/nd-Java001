package chapter14;

public class Penguin {
	 String name="������";
	 int health=100;
	 int love=80;
	 static final String SEX_MALE="Q��";
	 static final String SEX_FEMALE="Q��";
	 String sex;
	public Penguin(){
			
	}
	public Penguin(String name,String sex){
		this.name=name;
		this.sex=sex;
	}
	 public void print(String name,String sex){
		System.out.println("������԰ף�");
		System.out.println("�ҵ����ֽ�"+name+"������ֵ��"+health+"�������˵����ܶ���"+love+"������һֻ"+sex);
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	
}
