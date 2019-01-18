package course09.zy;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        String[] tj = new String[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<tj.length;i++){
            tj[i] = sc.nextLine();
        }
        System.out.println("本次活动特价商品有：");
        for(int i=0;i<tj.length;i++){
            System.out.println(tj[i]);
        }
    }
}
