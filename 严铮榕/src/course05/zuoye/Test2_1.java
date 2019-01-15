package course05.zuoye;

import java.util.Scanner;

public class Test2_1 {
    static void gwjs(int put){
        System.out.println("MyShopping管理系统 > 购物结算");
        System.out.println();
        System.out.println("**************************************");
        System.out.println("清选择购买的商品编号：");
        System.out.println("1.T恤   2.网球鞋   3.网球拍");
        System.out.println("**************************************");

        Scanner sc = new Scanner(System.in);
        int bianhao,num,sum = 1,shifu;
        String flag;
        do {
            System.out.printf("请输入商品编号：");
            bianhao = sc.nextInt();
            System.out.printf("请输入购买数量：");
            num = sc.nextInt();
            switch (bianhao) {
                case 1:
                    sum = num*245;
                    System.out.println("T恤 ￥245.0    数量："+num+"     合计￥"+sum);
                    break;
                case 2:
                    sum = num*299;
                    System.out.println("网球鞋 ￥299.0  数量："+num+"     合计￥"+sum);
                    break;
                case 3:
                    sum = num*288;
                    System.out.println("网球拍 ￥288.0  数量："+num+"     合计￥"+sum);
                    break;
                default:
                    System.out.println("输入错误，请重新输入！");
            }
            System.out.printf("是否继续（y/n）");
            flag = sc.next();
        } while (flag.equals("y"));
        System.out.println("折扣：0.8");
        float yinfu = sum*0.8f;
        System.out.println("应付金额："+yinfu);
        System.out.printf("实付金额：");
        shifu = sc.nextInt();
        while(shifu<yinfu){
            System.out.println("实付金额小于应付金额！请重新输入！");
            shifu = sc.nextInt();
        }
        double zq = shifu-yinfu;
        System.out.println("找钱："+zq);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int put=0;
        System.out.println("MyShopping管理系统");
        System.out.println();
        System.out.println("**************************************");
        System.out.println("1.客户信息管理");
        System.out.println("2.购物结算");
        System.out.println("3.真情回馈");
        System.out.println("4.注销");
        System.out.println("**************************************");
        System.out.println();
        System.out.println();
        System.out.println("请选择，输入数字：");
        put = sc.nextInt();
        while(put<1||put>4) {
            System.out.printf("输入错误，请输入数字：");
            put = sc.nextInt();
        }
        switch (put){
            case 1:
                System.out.println("执行客户信息管理");
                break;
            case 2:
                System.out.println("执行购物结算");
                gwjs(put);
                break;
            case 3:
                System.out.println("执行真情回馈");
                break;
            case 4:
                System.out.println();
                System.out.println();
                System.out.println("程序结束");
                break;
        }




    }
}
