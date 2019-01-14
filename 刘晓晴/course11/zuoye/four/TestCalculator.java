package course11;

import java.util.*;
public class TestCalculator {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Calculator calculator=new Calculator();
		System.out.print("请输入第一个计算的数字：");
		calculator.num1=input.nextDouble();
		System.out.print("请输入第二个计算的数字：");
		calculator.num2=input.nextDouble();
		calculator.add();
		calculator.minus();
		calculator.multiple();
		calculator.divide();
	}

}
