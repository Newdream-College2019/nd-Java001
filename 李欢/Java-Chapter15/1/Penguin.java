package chapter15;

public class Penguin extends Pet {
	 static final String SEX_MALE="Q��";
	 static final String SEX_FEMALE="Q��";
	 String sex;
	public Penguin(){
			
	}
	public Penguin(String name,String sex){
		this.name=name;
		this.sex=sex;
	}
	 public void print(){
		System.out.println("������԰ף�");
		System.out.println("�ҵ����ֽ�"+getName()+"������ֵ��"+getHealth()+"�������˵����ܶ���"+getLove()+"������һֻ"+getSex());
		}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	
}
