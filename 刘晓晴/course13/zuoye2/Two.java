package course13.zuoye;

public class Two {
	public void init(){
		System.out.println("�ͻ���Ϣ��");
	}
	public void addCus(String name,int age,boolean isCard){
		System.out.println(name+"\t"+age+"\t"+isCard);
	}
	public static void main(String[] args) {
	
		Two two=new Two();
		two.init();
		two.addCus("��һ", 30, false);
		
		Two two2=new Two();
		two2.addCus("��ǿ", 19, true);
	}
}
