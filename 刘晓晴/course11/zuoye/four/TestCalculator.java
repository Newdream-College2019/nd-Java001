package course11;

import java.util.*;
public class TestCalculator {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Calculator calculator=new Calculator();
		System.out.print("�������һ����������֣�");
		calculator.num1=input.nextDouble();
		System.out.print("������ڶ�����������֣�");
		calculator.num2=input.nextDouble();
		calculator.add();
		calculator.minus();
		calculator.multiple();
		calculator.divide();
	}

}
