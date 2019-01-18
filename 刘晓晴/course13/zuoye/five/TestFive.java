package course13.zuoye;

import java.util.*;
public class TestFive {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Five f=new Five();
		System.out.print("请输入行高：");
		int row=input.nextInt();
		System.out.print("请输入打印的字符：");
		String ch=input.next();
		f.printTriangle(row, ch);
	}
}
