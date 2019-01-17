package java12_人机猜拳;
import java.util.Random;
public class Computer {
	String name;
	//积分
	int score;
	//出拳
	public int getChoice() {
		//1,自动随机产生一个1～3范围的值
		Random rd = new Random();
		int number =rd.nextInt(3)+1;
		if(number==1) {
			System.out.print(name+"出拳为:剪刀");;
		}else if(number==2) {
			System.out.println(name+"出拳为: 石头");
		}else if(number==3) {
			System.out.println(name+"出拳为:布");
		}
		return number;
	}
	
}	
