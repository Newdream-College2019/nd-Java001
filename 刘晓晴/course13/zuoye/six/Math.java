package course13.zuoye;

public class Math {
	int max;
	int gw;
	int lf;
	int sum;
	public int max(int a,int b){
		if(a>b){
			max=a;
		}else{
			max=b;
		}
		return max;
	}
	public int gw(int a){
		gw=a%10;
		return gw;
	}
	public int lf(int a){
		lf=a*a*a;
		return lf;
	}
	public int he(int n){
		for(int i=1;i<=n;i++){
			sum+=i;
		}
		return sum;
	}
	
}
