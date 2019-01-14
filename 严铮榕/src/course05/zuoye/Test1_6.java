package course05.zuoye;

import java.util.Scanner;

public class Test1_6 {
    public static void main(String[] args) {
        int random, put;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("0.石头，1,剪刀，2.布");
            put = sc.nextInt();
            if (put < 0 || put > 2) {
                break;
            }

            random = (int) (Math.random() * (3));
            switch (random) {
                case 0:
                    System.out.println("电脑：石头");
                    break;
                case 1:
                    System.out.println("电脑：剪刀");
                    break;
                case 2:
                    System.out.println("电脑：布");
            }


            if (put == random) {
                System.out.println("平手");
            } else if (put < random) {
                if (random - put == 1) {
                    System.out.println("你赢了");
                } else {
                    System.out.println("电脑赢了");
                }
            } else {
                if (put - random == 1) {
                    System.out.println("电脑赢了");
                } else {
                    System.out.println("你赢了");
                }
            }
        }

    }
}
