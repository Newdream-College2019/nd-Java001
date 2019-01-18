package course06.zuoye;

import java.util.Scanner;

public class Test1_7 {
    public static void main(String[] args) {
        int sum=0,put;
        Scanner sc = new Scanner(System.in);
        do{
            put = sc.nextInt();
            sum+=put;
        }while(put!=0);
        System.out.println(sum);
    }
}
