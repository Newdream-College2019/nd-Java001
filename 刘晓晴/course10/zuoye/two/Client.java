package course10;

public class Client {
	int sum;
	String type;
	public void back(){
		System.out.println("积分："+sum+",卡类型："+type);
		if((type.equals("金卡")&&sum>1000)||(type.equals("普卡")&&sum>5000)){
			System.out.println("回馈积分500分！");
		}
		
	}
}
