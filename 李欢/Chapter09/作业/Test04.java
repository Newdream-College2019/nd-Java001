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
		System.out.print("ԭ�ַ����У�");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		Arrays.sort(arr);
		System.out.print("\n���������");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n������һ���ַ���");
		char a=input.next().charAt(0);
		int index=arr.length-1;
		for(int i=1;i<arr.length;i++){
			if(arr[i]>a){
				index=i-1;
				break;
			}
		}
		for(int i=0;i<index;i++){
			arr[i]=arr[i+1];
		}
		arr[index]=a;
		System.out.print("\n�����ַ�����ַ����У�");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n�����λ���ǣ�"+index);
	}
}