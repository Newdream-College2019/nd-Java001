package course13.zuoye;

import java.util.*;
public class TestFive {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Five f=new Five();
		System.out.print("�������иߣ�");
		int row=input.nextInt();
		System.out.print("�������ӡ���ַ���");
		String ch=input.next();
		f.printTriangle(row, ch);
	}
}
