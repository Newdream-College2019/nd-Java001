package course05.zuoye;

import java.util.Scanner;

public class Test1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int put;
        do{
            put = sc.nextInt();
            switch (put){
                case 1:
                    System.out.println("MON");
                    break;
                case 2:
                    System.out.println("TUS");
                    break;
                case 3:
                    System.out.println("WED");
                    break;
                case 4:
                    System.out.println("THI");
                    break;
                case 5:
                    System.out.println("FRI");
                    break;
                case 6:
                    System.out.println("STA");
                    break;
                case 7:
                    System.out.println("SUM");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("输入错误，请重新输入！");
            }
        }while(put!=0);
    }
}
