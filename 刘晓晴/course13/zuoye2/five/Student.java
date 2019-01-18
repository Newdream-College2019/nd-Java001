package course13.zuoye;

public class Student {
	String name;
	int age;
	String sex;
	public String toString(){
		return "大家好，我是"+name+",性别"+sex+",今年"+age+"岁。";
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getSex(){
		return sex;
	}
	public void setSex(String sex){
		this.sex=sex;
	}
	public int shuZu(int[] arr){
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		return sum;
	}
	public int ji(int n){
		int sum = 1;
		for(int i=1;i<=n;i++){
			sum=sum*i;
		}
		return sum;
	}
	public boolean zhiShu(int n){
		boolean flag=true;
		for(int i=2;i<n;i++){
			if(n%i==0){
				flag=false;
				break;
			}
		}
		return flag;
	}
	public int minBs(int a,int b){
		int sum = 0;
		for(int i=(a>b?a:b);i<=a*b;i++){
			if(i%a==0&&i%b==0){
				sum=i;
				break;
			}
		}
		return sum;
	}
	public int maxYs(int a,int b){
		int sum = 0;
		for(int i=(a<b?a:b);i>1;i--){
			if(a%i==0&&b%i==0){
				sum=i;
				break;
			}
		}
		return sum;
	}
	public int num(int n){
		int a=1,b=1;
		int c=0;
		if(n==1){
			c=1;
		}else if(n==2){
			c=1;
		}else{
			for(int i=3;i<=n;i++){
				c=a+b;
				a=b;
				b=c;
			}
		}
		return c;
	}
	public int[] yXu(int[] arr){
		int temp;
		for(int i=1;i<arr.length;i++){
			for(int j=0;j<arr.length-i;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	public Duck exchange(Chicken ch){
		Duck duck=new Duck();
		if(ch.price==duck.price){
			return duck;
		}
		return null;
	}
}
