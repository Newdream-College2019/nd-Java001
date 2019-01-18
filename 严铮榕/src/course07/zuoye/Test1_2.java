package course07.zuoye;

import java.util.Scanner;

public class Test1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String put="";
        String s="";
        while(true){
            put = sc.nextLine();
            if(put.equals("Esc")){
                break;
            }
            s += put;
        }
        System.out.println(s);
    }
}
