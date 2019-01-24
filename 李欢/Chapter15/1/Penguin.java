package chapter15;

public class Penguin extends Pet {
	 static final String SEX_MALE="Q仔";
	 static final String SEX_FEMALE="Q妹";
	 String sex;
	public Penguin(){
			
	}
	public Penguin(String name,String sex){
		this.name=name;
		this.sex=sex;
	}
	 public void print(){
		System.out.println("宠物的自白：");
		System.out.println("我的名字叫"+getName()+"，健康值是"+getHealth()+"，和主人的亲密度是"+getLove()+"，我是一只"+getSex());
		}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	
}
