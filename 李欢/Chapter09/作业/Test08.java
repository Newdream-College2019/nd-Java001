import java.util.*;
public class Test08{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String[] arr=new String[5];
		arr[0]="Island";
		arr[1]="Ocean";
		arr[2]="Pretty";
		arr[3]="Sun";
		System.out.print("插入前的数组为：");
		for(int i=0;i<arr.length-1;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n请输入歌曲名称：");
		String n=input.next();
		char s=n.charAt(0);
		char temp=0;
		int index=arr.length-1;
		for(int i=0;i<arr.length;i++){
			temp=arr[i].charAt(0);
			if(s<temp){
				index=i;
				break;
			}
		}
		for(int i=arr.length-2;i>=index;i--){
			arr[i+1]=arr[i];
		}
		arr[index]=n;
		System.out.print("\n插入后的数组为：");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
}