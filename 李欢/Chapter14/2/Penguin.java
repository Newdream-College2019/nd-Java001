package chapter14;

public class Penguin {
	 String name="无名氏";
	 int health=100;
	 int love=80;
	 static final String SEX_MALE="Q仔";
	 static final String SEX_FEMALE="Q妹";
	 String sex;
	public Penguin(){
			
	}
	public Penguin(String name,String sex){
		this.name=name;
		this.sex=sex;
	}
	 public void print(String name,String sex){
		System.out.println("宠物的自白：");
		System.out.println("我的名字叫"+name+"，健康值是"+health+"，和主人的亲密度是"+love+"，我是一只"+sex);
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	
}
