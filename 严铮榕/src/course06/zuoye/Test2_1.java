package course06.zuoye;

import java.util.Scanner;
import java.math.BigDecimal;

public class Test2_1 {

    public static double round(double v,int scale){
        if(scale<0){
            throw new IllegalArgumentException(
                    "The scale must be a positive integer or zero");
        }
        BigDecimal b = new BigDecimal(Double.toString(v));
        BigDecimal one = new BigDecimal("1");
        return b.divide(one,scale,BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static void main(String[] args) {
        int less_sum = 0,pass_sum = 0;
        Scanner sc = new Scanner(System.in);
        int put;
        for(int i=1;i<=10;i++){
            System.out.print("请输入第"+i+"位顾客的年龄：");
            put = sc.nextInt();
            if(put>30){
                pass_sum++;
            }else{
                less_sum++;
            }
        }
        double less = less_sum%10;
        less = round(less*0.1,1);
        double pass = pass_sum%10;
        pass = round(pass*0.1,1);

        System.out.println("30岁以下的比例是"+less*100+"%");
        System.out.println("30岁以上的比例是"+pass*100+"%");
    }
}
