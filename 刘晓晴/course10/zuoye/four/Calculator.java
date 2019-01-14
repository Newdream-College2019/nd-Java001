package course10;

public class Calculator {
	double num1;
	double num2;
	public void add(){
		System.out.println(num1+"+"+num2+"="+(num1+num2));
	}
	public void subtract(){
		System.out.println(num1+"-"+num2+"="+(num1-num2));
	}
	public void multiply(){
		System.out.println(num1+"*"+num2+"="+(num1*num2));
	}
	public void divide(){
		System.out.println(num1+"/"+num2+"="+(num1/num2));
	}
}
