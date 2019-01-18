package course09.zy;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int ff_count =0,zs_count = 0;
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            if((arr[i]==1)||(arr[i]==2)||(arr[i]==3)){
                ff_count++;
            }else{
                zs_count++;
            }
        }
        System.out.println("整数个数："+zs_count);
        System.out.println("非法数字个数："+ff_count);
    }
}
