package course10;

public class Client {
	int sum;
	String type;
	public void back(){
		System.out.println("���֣�"+sum+",�����ͣ�"+type);
		if((type.equals("��")&&sum>1000)||(type.equals("�տ�")&&sum>5000)){
			System.out.println("��������500�֣�");
		}
		
	}
}
