package course11;

import java.util.*;
public class TestLeap {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("ÇëÊäÈëÄê·İ£º");
		IsLeap isLeap=new IsLeap();
		isLeap.year=input.nextInt();
		System.out.println(isLeap.isLeap());
	}
}
