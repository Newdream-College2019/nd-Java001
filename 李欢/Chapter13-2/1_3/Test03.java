package chapter13_2;

import java.util.Scanner;

public class Test03 {
	public void insertArray(int[] arr,int index,int value){
		for(int i=0;i<arr.length;i++){
			if(value<=arr[i]){
				index=i;
				break;
			}
		}
		for(int i=0;i<index-1;i++){
			arr[i]=arr[i+1];
		}
		arr[index-1]=value;
	}
	public static void main(String[] args) {
		Test03 t=new Test03();
		Scanner input=new Scanner(System.in);
		int[] arr=new int[]{2,6,13,25,46,89};
		int index=arr.length-1;
		System.out.print("����ǰ�����ֵΪ��");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.print("\n������Ҫ�������������");
		int value=input.nextInt();
		t.insertArray(arr, index, value);
		System.out.print("����������ֵΪ��");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}
}
