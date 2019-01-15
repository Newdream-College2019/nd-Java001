package course12;

import java.util.*;

public class Game {
	Player person;
	Computer comp; 
	int count=0;
	Scanner input=new Scanner(System.in);
	public void initial(){
		person=new Player();
		comp=new Computer();
		System.out.println("-----------------欢迎进入游戏世界------------------");
		System.out.println("\n\t\t**************");
		System.out.println("\t\t**猜拳，开始**");
		System.out.println("\t\t**************\n");
		
		System.out.println("出拳规则：1.剪刀 2.石头 3.布");
		System.out.print("请选择对方角色：（1.刘备 2.孙权 3.曹操）:");
		int num=input.nextInt();
		if(num==1){
			comp.name="刘备";
			System.out.println("你选择了刘备对战");
		}else if(num==2){
			comp.name="孙权";
			System.out.println("你选择了孙权对战");
		}else if(num==3){
			comp.name="曹操";
			System.out.println("你选择了曹操对战");
		}else{
			System.out.println("输入错误");
		}
		System.out.print("\n请输入你的名字：");
		person.name=input.next();
		System.out.println(person.name+" VS "+comp.name+" 对战");
		
	}
	public void starGame(){
		System.out.print("\n要开始吗？（y/n）:");
		String answer=input.next();
		int pChoice=0,cChoice=0;
		while(answer.equals("y")){
			System.out.print("\n请出拳：1.剪刀 2.石头 3.布（输入相应的数字）：");
			pChoice=person.getChoice();
			cChoice=comp.getChioce();
			if((cChoice-pChoice)==0){
				System.out.println("结果：和局，真衰！嘿嘿，等着瞧吧！");
			}else if((cChoice-pChoice)==-2||(cChoice-pChoice)==1){
				System.out.println("结果：^_^,你输了,真笨！");
				comp.score++;
			}else{
				System.out.println("结果：恭喜，你赢了！");
				person.score++;
			}
			System.out.print("\n是否进入下一轮：（y/n）:");
			answer=input.next();
			count++;
		}
	}
	public void showFirst(){
		System.out.println("------------------------------------------");
		System.out.println(comp.name+" VS "+person.name);
		System.out.println("\n对战次数："+count);
		System.out.println("姓名\t\t得分");
		System.out.println(person.name+"\t\t"+person.score);
		System.out.println(comp.name+"\t\t"+comp.score);
		if(person.score>comp.score){
			System.out.println("\n结果：恭喜恭喜！");
		}else{
			System.out.println("\n结果：呵呵，笨笨，下次加油啊！");
		}
		
	}

}
