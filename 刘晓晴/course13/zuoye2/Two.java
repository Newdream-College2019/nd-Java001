package course13.zuoye;

public class Two {
	public void init(){
		System.out.println("客户信息：");
	}
	public void addCus(String name,int age,boolean isCard){
		System.out.println(name+"\t"+age+"\t"+isCard);
	}
	public static void main(String[] args) {
	
		Two two=new Two();
		two.init();
		two.addCus("王一", 30, false);
		
		Two two2=new Two();
		two2.addCus("郝强", 19, true);
	}
}
