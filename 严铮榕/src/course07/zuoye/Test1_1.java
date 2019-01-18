package course07.zuoye;

import java.util.Scanner;

public class Test1_1 {
    static int fun(int x) {
        if (x <= 1) {
            return 1;
        } else {
            return x * fun(x - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int put = sc.nextInt();
        if (put > 10 || put < 1) {
            System.out.println("只能输入1-10内数字");
        } else {
            int res = fun(put);
            System.out.printf(put+"!=");
            for(int i=put;i>=1;i--){
                if(i==1){
                    System.out.printf(i+"="+res);
                    break;
                }
                System.out.printf(i+"*");
            }

        }

    }
}
