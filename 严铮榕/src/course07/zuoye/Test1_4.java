package course07.zuoye;

import java.util.Scanner;

public class Test1_4 {
    public static void main(String[] args) {
        int zs_count = 0;
        int fs_count = 0;
        int zero_count = 0;
        double put;
        Scanner sc = new Scanner(System.in);
        do{
            put = sc.nextDouble();
            if(put==0){
                zero_count++;
            }else if(put>0){
                zs_count++;
            }else{
                fs_count++;
            }
        }while(put!=999);
        System.out.println("正数的个数："+zs_count);
        System.out.println("负数的个数："+fs_count);
        System.out.println("0的个数："+zero_count);
    }
}
