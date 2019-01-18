package course14;

public class Penguin {
	private String name;
	private int health=100;
	private int love=80;
	private String sex;
	static final String SEX_MALE="Q仔";
	static final String SEX_FEMALE="Q妹";
	public Penguin(){
		
	}
	public Penguin(String name,String sex){
		this.name=name;
		this.sex=sex;
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
		if(health>0&&health<100){
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
	public String getSex() {
		return this.sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void show(){
		System.out.println("宠物自白：");
		System.out.println("我的名字叫"+getName()+",健康值是"+getHealth()+",和主人的亲密度是"+getLove()+",我是聪明的"+getSex());
	}
	
}
