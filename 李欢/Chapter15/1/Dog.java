package chapter15;

public class Dog extends Pet {
	private String strain="��������������Ȯ";
	public Dog(){
		 
	}
	public Dog(String name, String strain) {
		this.name=name;
		this.strain=strain;
	}
	public void print(){
		System.out.println("������԰ף�");
		System.out.println("�ҵ����ֽ�"+getName()+"������ֵ��"+getHealth()+"�������˵����ܶ���"+getLove()+"������һֻ"+getStrain());
	}
	public String getStrain() {
		return strain;
	}
	public void setStrain(String strain) {
		this.strain = strain;
	}
	
	
}
