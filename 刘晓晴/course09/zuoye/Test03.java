import java.util.*;
public class Test03{
	public static void main(String[] args){
		char[] arr=new char[]{'a','c','u','b','e','p','f','z'};
		System.out.print("ԭ�ַ����У�");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		Arrays.sort(arr);
		System.out.print("\n���������");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n�������Ϊ��");
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]+" ");
		}
	}

}