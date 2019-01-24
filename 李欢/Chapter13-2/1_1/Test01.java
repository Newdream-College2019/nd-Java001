package chapter13_2;

import java.util.Arrays;

public class Test01 {
	public void array(String[] arr){
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		Test01  array=new Test01();
		String[] arr=new String[]{"iris","hello","may","alex"};
		array.array(arr);
	}
}
