package course05.zuoye;

import java.util.Scanner;

public class Test1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer;
        do {
            System.out.println("你的名字叫什么？");
            answer = sc.nextLine();
        } while (answer.equals("不告诉你"));
        System.out.println("你的名字是：" + answer);
    }
}
