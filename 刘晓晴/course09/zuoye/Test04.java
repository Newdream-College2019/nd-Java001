import java.util.*;
public class Test04{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		char[] arr=new char[9];
		arr[0]='a';
		arr[1]='c';
		arr[2]='u';
		arr[3]='b';
		arr[4]='e';
		arr[5]='p';
		arr[6]='f';
		arr[7]='z';
		System.out.print("原字符序列：");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		Arrays.sort(arr);
		System.out.print("\n升序后字符序列：");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n请输入一个字符：");
		char a=input.next().charAt(0);
		int index=arr.length-1;
		for(int i=1;i<arr.length;i++){
			if(a<arr[i]){
				index=i-1;
				break;
			}
		}
		//移动元素
		for(int i=0;i<index;i++){
			arr[i]=arr[i+1];
		}
		//插入数据
		arr[index]=a;
		System.out.print("\n插入字符后的字符序列：");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n插入的位置是："+index);
		
	}

}