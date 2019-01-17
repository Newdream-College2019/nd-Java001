package java12_人机猜拳;

import java.util.Scanner;

public class Player {
    String name;
    int score;

    // 出拳的方法
    public int getChoice() {
        Scanner input = new Scanner(System.in);
        System.out.print("请出拳：1.剪刀，2.石头，3.布(请输入相应的数字):");
        int number = input.nextInt();
        if (number == 1) {
            System.out.println("你出拳为:剪刀");
            ;
        } else if (number == 2) {
            System.out.println("你出拳为: 石头");
        } else if (number == 3) {
            System.out.println("你出拳为:布");
        }
        return number;
    }

}
