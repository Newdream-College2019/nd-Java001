package chapter10;

import java.util.Scanner;

public class TestAdmin {
	public static void main(String[] args) {
		Admin admin=new Admin();
		admin.username="admin1";
		admin.password="111111";
		Admin admin2=new Admin();
		admin2.username="admin2";
		admin2.password="222222";
		admin.show();
		admin2.show();
		
		Scanner input=new Scanner(System.in);
		System.out.print("\n�������û�����");
		admin.username=input.next();
		System.out.print("���������룺");
		admin.password=input.next();
		
		if(admin.username.equals("admin1")&&admin.password.equals("111111")){
			admin.rePassword();
		}else if(admin.username.equals("admin2")&&admin.password.equals("222222")){
			admin.rePassword();
		}else{
			System.out.println("�û��������벻ƥ�䣡��û��Ȩ�޸��¹���Ա��Ϣ��");
		}
	}

}
  