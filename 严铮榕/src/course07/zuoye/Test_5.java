package course07.zuoye;

import java.util.Scanner;

public class Test_5 {
    public static void fun(int put) {
        double fenmu = 1, fenzi = 0;
        int i = 1;
        while (i <= put) {
            fenmu = fenmu * i * i;
            i++;
        }
        i=1;
        while (i <= put) {
            fenzi += fenmu / (i * i);
            i++;
        }
        System.out.println(fenzi/fenmu);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int put = sc.nextInt();
        if (put > 0) {
            fun(put);
        } else {
            System.out.println("输入错误！");
        }
    }

}
