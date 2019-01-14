package course10;

import java.util.*;

public class Manager {
	Scanner input=new Scanner(System.in);
	String name;
	String password;
	public void show(){
		System.out.println("姓名："+name+",密码:"+password);
	}
	public void rePassword(){
		String rePassword;
		System.out.print("\n请输入新密码：");
		rePassword=input.next();
		password=rePassword;
		System.out.print("修改密码成功，您的新密码为："+password);
	}
}
