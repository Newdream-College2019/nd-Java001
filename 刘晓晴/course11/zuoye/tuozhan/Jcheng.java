package course11;

import java .util.*;
public class Jcheng {
	public int jiecheng(int n){
		if(n<=1){
			return 1;
		}
		return n*jiecheng(n-1);
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Jcheng j=new Jcheng();
		System.out.println("������һ����:");
		int n=input.nextInt();
		System.out.println(n+"�Ľ׳ˣ�"+j.jiecheng(n));
	}
}
