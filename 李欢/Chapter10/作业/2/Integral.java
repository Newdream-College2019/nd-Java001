package chapter10;

public class Integral {
	int score;
	String type;
	public void show(){
		System.out.println("���֣�"+score+"�������ͣ�"+type);
		if((type.equals("��")&&score>1000)||type.equals("�տ�")&&score>5000){
			System.out.println("��������500�֣�");
		}
	}
}
