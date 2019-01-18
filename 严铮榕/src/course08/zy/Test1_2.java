package course08.zy;

import java.util.Scanner;

public class Test1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double put;
        int count=0;
        for(int i=0;i<5;i++){
            put = sc.nextDouble();
            if(put>80){
                count++;
                continue;
            }
        }
        System.out.println("一共"+count+"人");
    }
}
