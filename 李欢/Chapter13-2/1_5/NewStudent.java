package chapter13_2;

import java.util.Scanner;

public class NewStudent {
	String name;
	int age;
	String sex;
	@Override
	public String toString() {
		return "我叫" + name + ", 今年" + age + "岁, 是一个" + sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public int add(int[] arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		return sum;
	}
	
	public int ji(int num){
		int ji=1;
		for(int i=1;i<=num;i++){
			ji=ji*i;
		}
		return ji;
	}
	
	public boolean prime(int num){
		boolean flag=true;
		for(int i=2;i<num;i++){
			if(num%i==0){
				flag=false;
				break;
			}
		}	
		return flag;
		}
	public int minBei(int a,int b){
		int sum=0;
		for(int i=(a>b?a:b);i<=a*b;i++){
			if(i%a==0&&i%b==0){
				sum=i;
				break;
			}
		}
		return sum;	
	}
	public int maxYue(int c,int d){
		int sum=0;
		for(int i=(c<d?c:d);i>=1;i--){
			if(c%i==0&&d%i==0){
				sum=i;
				break;
			}
		}
		return sum;	
	}
	public int fblq(int num3){
		int a=1;
		int b=1;
		int temp = 0;
		if(num3==1){
			temp=1;
		}else if(num3==2){
			temp=1;
		}else{
			for(int i=3;i<=num3;i++){
				temp=a+b;
				a=b;
				b=temp;
			}
		}
		return temp;
	}
	public int[] youxu(int[] brr){
		int temp;
		for(int i=1;i<brr.length;i++){
			for(int j=0;j<brr.length-i;j++){
				if(brr[j]>brr[j+1]){
					temp=brr[j+1];
					brr[j+1]=brr[j];
					brr[j]=temp;
				}
			}
		}
		return brr;
	}
	public Duck change(Chicken ch){
		Duck duck=new Duck();
		if(ch.price==duck.price){
			return duck;
		}
		return null;
	}
	
	
}
