package chapter10;

public class Integral {
	int score;
	String type;
	public void show(){
		System.out.println("积分："+score+"，卡类型："+type);
		if((type.equals("金卡")&&score>1000)||type.equals("普卡")&&score>5000){
			System.out.println("回馈积分500分！");
		}
	}
}
