package course11;

public class Calculator {
	double num1;
	double num2;
	public void add(){
		System.out.println(num1+"+"+num2+"="+(num1+num2));
	}
	public void minus(){
		System.out.println(num1+"-"+num2+"="+(num1-num2));
	}
	public void multiple(){
		System.out.println(num1+"*"+num2+"="+(num1*num2));
	}
	public void divide(){
		System.out.println(num1+"/"+num2+"="+(num1/num2));
	}
}
