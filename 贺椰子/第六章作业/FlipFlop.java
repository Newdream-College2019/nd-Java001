import java.util.Scanner;
public class FlipFlop{
	public static void main(String[] args) {
		boolean b;
		for(int i=1;i<=100;i++){
			b=true;
			if(i%3==0){
				System.out.println("Flip");
				b=false;
			}
			if(i%5==0){
				System.out.println("Flop");
				b=false;
			}
			if(i%3==0&&i%5==0){
				System.out.println("FlipFlop");
				b=false;
			}
			if(b){
				System.out.println(i);
			}	
			
		}
	}
}
