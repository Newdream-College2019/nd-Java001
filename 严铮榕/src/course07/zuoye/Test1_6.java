package course07.zuoye;

import java.util.Scanner;

public class Test1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j_count=0,o_count=0;
        for(int i =1;i<=n;i++){
            if(i==1){
                j_count++;
            } else if(i%2==0){
                o_count++;
            }else{
                j_count++;
            }
        }
        System.out.println("奇数有："+j_count);
        System.out.println("偶数有："+o_count);
    }
}
