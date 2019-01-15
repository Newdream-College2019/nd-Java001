package course05.zuoye;

import java.util.Scanner;

public class Test1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int put;
        while (true) {
            put = sc.nextInt();
            if (put == 0) {
                System.out.println("你出的是石头");
            } else if (put == 1) {
                System.out.println("你出的是剪刀");
            } else if (put == 2) {
                System.out.println("你出的是布");
            } else {
                break;
            }
        }
    }
}
