package course10;
import java.util.*;

public class TestManager {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Manager user1=new Manager();
		user1.name="admin1";
		user1.password="111111";
		
		Manager user2=new Manager();
		user2.name="admin2";
		user2.password="222222";
		
		user1.show();
		user2.show();
		
		System.out.println("\n");
		
		System.out.print("�������û�����");
		String name1=input.next();
		System.out.print("���������룺");
		String password1=input.next();
		
		if(name1.equals(user1.name)&&password1.equals(user1.password)){
			user1.rePassword();
		}else if(name1.equals(user2.name)&&password1.equals(user2.password)){
			user2.rePassword();
		}else{
			System.out.println("�û��������벻ƥ�䣡��û��Ȩ�޸��¹���Ա��Ϣ��");
		}
		
	}

}
