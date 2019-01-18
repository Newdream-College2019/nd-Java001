package course14;

public class Penguin {
	private String name;
	private int health;
	private int love;
	private String sex;
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
			System.out.println("ÊäÈë´íÎó");
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
	
}
