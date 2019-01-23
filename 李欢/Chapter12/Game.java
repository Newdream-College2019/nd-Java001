package chapter12;

import java.util.Scanner;

public class Game {
	Scanner input=new Scanner(System.in);
	Person person=new Person();
	Computer comp=new Computer();
	int comScore=0;
	int perScore=0;
	public void inital(){	
		System.out.println("-----------------欢迎进入游戏世界---------------\n\n");
		System.out.println("\t\t*********************");
		System.out.println("\t\t**     猜拳，开始       **");
		System.out.println("\t\t*********************");
		System.out.println("\n\n出拳规则：1.剪刀2.石头3.布");
		System.out.print("请选择对方角色：（1：刘备 2：孙权 3：曹操）：");
		int a=input.nextInt();
		if(a==1){
			comp.name="刘备";
			System.out.println("你选择了刘备对战");
		}else if(a==2){
			comp.name="孙权";
			System.out.println("你选择了孙权对战");
		}else if(a==3){
			comp.name="曹操";
			System.out.println("你选择了曹操对战");
		}else{
			System.out.println("输入有误！！！");
		}
		System.out.print("请输入你的姓名：");
		String name=input.next();
		person.name=name;
		System.out.println(person.name+" VS "+comp.name+" 对战");
	}
	public void startGame(){
		int count=0;
		System.out.print("\n要开始了吗（y/n):");
		String tt=input.next();
		while(!tt.equals("n")){
			if(tt.equals("y")){
				int per=person.showFirst();
				int com=comp.getChoice();	
				showResult(per, com);
			}
		count++;
		System.out.print("\n\n是否开始下一轮（y/n):");
		tt=input.next();
		}
		System.out.println("\n一共进行了"+count+"局");
		System.out.println("姓名\t\t得分");
		System.out.println(person.name+"\t\t"+perScore);
		System.out.println(comp.name+"\t\t"+comScore);
		if(perScore>comScore){
			System.out.println("\n结果：恭喜恭喜！");
		}else{
			System.out.println("\n结果：呵呵，笨笨，下次加油啊！");
		}
	}
	public void showResult(int per,int com){
		if(per==com){
					System.out.println("结果说：和局，真衰！嘿嘿，等着瞧吧！");
				}else if(per-com==-1||per-com==2){
					System.out.println("结果说：你输了，真笨！");
					comScore++;
				}else{
					System.out.println("结果说：恭喜你赢了！");
					perScore++;
				}
		
	}
	

}
