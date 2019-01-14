import java.util.*;
public class Test06{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int[] arr=new int[10];
		int ff=0;
		int sum=0;
		for(int i=0;i<arr.length;i++){
			System.out.print("\n请输入"+(i+1)+"个数：");
			arr[i]=input.nextInt();
			if(arr[i]!=1&&arr[i]!=2&&arr[i]!=3){
				System.out.print("\t\t"+arr[i]+"是非法数字");
				ff++;
			}else{
				sum++;
			}
		}
		System.out.println("\n非法数字有："+ff+"个\n整数有："+sum+"个");
	}
}