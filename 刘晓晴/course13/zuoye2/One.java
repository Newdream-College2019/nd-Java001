package course13.zuoye;

import java.util.*;

public class One {
	public void paiXu(String[] arr){
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");
		}
	}
	public static void main(String[] args) {
		One o=new One();
		String[] arr=new String[]{"lili","xiao","amy","mei"};
		o.paiXu(arr);
	}
}
