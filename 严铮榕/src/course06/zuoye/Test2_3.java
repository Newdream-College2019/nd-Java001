package course06.zuoye;

import java.util.Scanner;

public class Test2_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username;
        int pwd;
        for (int i = 2; i >= 0; i--) {
            if (i != 2) {
                sc.nextLine();
            }

            System.out.print("请输入用户名：");
            username = sc.nextLine();
            System.out.print("请输入密码：");
            pwd = sc.nextInt();
            if (username.equals("jim")) {
                if (pwd == 123456) {
                    System.out.println("欢迎登陆Myshopping系统！");
                    break;

                } else {
                    System.out.println("输入错误！您还有" + i + "次机会！");
                }
                if (i == 0) {
                    System.out.println("对不起，您3次均输入错误！");
                    break;
                }
            }
        }
    }
}
