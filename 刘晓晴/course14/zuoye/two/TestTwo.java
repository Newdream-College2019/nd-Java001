package course14;

import java.util.*;
public class TestTwo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String name;
		String type;
		String strain = null;
		String sex = null;
		String color = null;
		System.out.println("欢迎您来到宠物店！");
		System.out.print("请输入要领养宠物的名字：");
		name=input.next();
		System.out.print("请选择要领养的宠物类型：(1、狗狗 2、企鹅 3、猪)");
		int n=input.nextInt();
		if(n==1){
			type="狗狗";
			System.out.print("请选择狗狗的品种：(1、聪明的拉布拉多犬 2、酷酷的雪纳瑞)");
			int p=input.nextInt();
			if(p==1){
				strain="聪明的拉布拉多犬";
			}else if(p==2){
				strain="酷酷的雪纳瑞";
			}
			Dog dog=new Dog(name,strain);
			//dog.setName(name);
			//dog.setStrain(strain);
			dog.show();
		}else if(n==2){
			type="企鹅";
			System.out.print("请选择企鹅的性别：(1、Q仔 2、Q妹)");
			int p=input.nextInt();
			if(p==1){
				//sex="Q仔";
				sex=Penguin.SEX_MALE;
			}else if(p==2){
				//sex="Q妹";
				sex=Penguin.SEX_FEMALE;
			}
			Penguin penguin=new Penguin();
			penguin.setName(name);
			penguin.setSex(sex);
			penguin.show();
		} else{
			type="猪";
			System.out.print("请选择猪的毛发颜色：(1、粉色 2、黑色)");
			int p=input.nextInt();
			if(p==1){
				color="粉色";
			}else if(p==2){
				color="黑色";
			}
			Pig pig=new Pig();
			pig.setName(name);
			pig.setColor(color);
			pig.show();
		}
	
		
	}
}
