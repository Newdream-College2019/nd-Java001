package course10;

import java.util.*;

public class Manager {
	Scanner input=new Scanner(System.in);
	String name;
	String password;
	public void show(){
		System.out.println("������"+name+",����:"+password);
	}
	public void rePassword(){
		String rePassword;
		System.out.print("\n�����������룺");
		rePassword=input.next();
		password=rePassword;
		System.out.print("�޸�����ɹ�������������Ϊ��"+password);
	}
}
