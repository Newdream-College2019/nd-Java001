import java.util.Scanner;
public class Test03{
	public static void main(String[] args){
		int[] number={5,8,6,9,2};
		int temp=0,k=1;
		/*Scanner in=new Scanner();
		for(int i=0;i<5;i++){
			System.out.print("请输入五个值");
			number[i]=in.nextInt();
		}
		*/
		for(int i=0;i<number.length;i++){
			for(int j=i+1;j<number.length-k;j++){
				k++;
				if(number[i]>number[j]){
					temp=number[i];
					number[i]=number[j];
					number[j]=temp;
				}
				
			}
		}

		for(int i=0;i<number.length;i++){
		System.out.print(number[i]);
		}
	}
}