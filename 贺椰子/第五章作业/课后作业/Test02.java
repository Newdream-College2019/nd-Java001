public class Test02{
	public static void main(String[] args) {
		double i=1;
		double s=0;
		while(i<=20){
			s+=1/(i*i);
			i++;
		}
		System.out.println(s);
	}
}
