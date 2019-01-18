package course09.zy;

import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        String[] str = new String[5];
        str[0] = "Island";
        str[1] = "Ocean";
        str[2] = "Pretty";
        str[3] = "Sun";
        System.out.printf("插入前的数组为：");
        for(int i=0;i<str.length;i++){
            System.out.printf(str[i]+"\t");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.printf("请输入新的歌曲名称：");
        String put = sc.nextLine();
        str[str.length-1] = put;
        for(int i=0;i<str.length-1;i++){
            for(int j=0;j<str.length-1-i;j++){
                int res = str[j].compareToIgnoreCase(str[j+1]);
                if(res>0){
                    String temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                }
            }
        }
        System.out.printf("插入后的数组为：");
        for(int i=0;i<str.length;i++){
            System.out.printf(str[i]+"\t");
        }
        System.out.println();
    }
}
