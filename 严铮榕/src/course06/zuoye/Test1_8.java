package course06.zuoye;

import java.util.Scanner;

public class Test1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double put;
        int sum=0;
        for(int i=0;i<5;i++){
            put = sc.nextDouble();
            if(put>80){
                sum++;
            }else{
                continue;
            }
        }
        System.out.println(sum);
    }
}
