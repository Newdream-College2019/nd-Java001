package java12_人机猜拳;

import java.util.Scanner;

public class Game {
		//属性
		Player person;
		Computer comp;
		int count;
		//方法
		//1,初始化方法-----玩家，电脑
		public void inital() {
			//1,创建对象：玩家对象，电脑对象
			person = new Player();
			comp = new Computer();
			Scanner input =new Scanner(System.in);
			System.out.println("--------------------欢迎进入游戏世界--------------------\n\n");
			System.out.println("\t\t\t**************");
			System.out.println("\t\t\t**猜拳，开始**");
			System.out.println("\t\t\t**************");
			System.out.println("出拳规则：1.剪刀，2.石头，3.布");
			System.out.print("请选择对方角色：（1:刘备，2:曹操，3:孙权）：");
			int role  = input.nextInt();
			if(role==1) {
				comp.name="刘备";
			}else if(role==2) {
				comp.name="曹操";
			}else if(role==3) {
				comp.name="孙权";
			}
			System.out.print("请输入你的名字：");
			String name = input.next();
			person.name = name;
		}
		//启动游戏的方法
		public void startGame() {	
			Scanner input =new Scanner(System.in);
			System.out.print("要开始吗？（y/n）:");
			String isStart  = input.next();
			if(isStart.equals("y")) {
				//1,玩家出拳，并打印
				int perChoice = person.getChoice();
				//2，电脑出拳，并打印
				int compChoice = comp.getChoice();
				//3,判断输赢
				showResult(compChoice, perChoice);
			}
		}
			
		//计算比赛结果并显示结果的方法
			
		public void showResult(int compChoice,int perChoice) {
			if((compChoice-perChoice)==0) {
				System.out.println("恭喜：你与"+comp.name+"平局");
			}else if((compChoice-perChoice)==-1|| (compChoice-perChoice)==2) {
				System.out.println("恭喜：你赢了");
			}else {
				System.out.println("恭喜："+comp.name+"赢了！");
			}
		}
	
		public static void main(String[] args) {
			//1,创建游戏对象
			Game g = new Game();
	
			//2，初始化游戏
			g.inital();
			//3,	 启动比赛
			g.startGame();
		}
			
			
		
}
