package course11;

public class Manager {
	/**
	 * @author 小晴
	 * @version 1.0版*/
	String name;
	String password;
	/**显示管理员信息的方法*/
	public String show(){
		return "管理员信息用户名为:"+name+"\t密码为："+password;
	}
}
