package course06.zuoye;

import java.util.Scanner;

public class Test2_2 {
    public static void main(String[] args) {
        System.out.println("MyShopping管理系统 > 客户信息管理 > 添加客户信息");
        System.out.println();
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int hyh,jf;
        String bth;
        for(int i=0;i<3;i++){
            System.out.print("请输入会员号（<4位整数>）：");
            hyh = sc.nextInt();
            System.out.print("请输入会员生日（月/日<用两位整数表示>）：");
            sc.nextLine();
            bth = sc.nextLine();
            System.out.print("请输入会员积分：");
            jf = sc.nextInt();
            System.out.println("您录入的会员信息是：");
            System.out.println(hyh+"  "+bth+"  "+jf);
            System.out.println();
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("程序结束！");
    }
}
