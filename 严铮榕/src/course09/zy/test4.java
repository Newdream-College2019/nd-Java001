package course09.zy;

import java.util.Scanner;

class Insert{
    public void insert(char arr[],char m){
        arr[0] = m;
        Array ar = new Array();
        ar.sort(arr);
    }
}

public class test4 {
    public static void main(String[] args) {
        char arr[] = new char[9];
        arr[0]='a';
        arr[1]='c';
        arr[2]='u';
        arr[3]='b';
        arr[4]='e';
        arr[5]='p';
        arr[6]='f';
        arr[7]='z';
        System.out.printf("原字符序列：");
        for(int i=0;i<arr.length;i++){
            System.out.printf(arr[i]+"\t");
        }
        System.out.println();
        Array ar = new Array();
        ar.sort(arr);
        System.out.printf("升序后得字符序列：");
        for(int i=0;i<arr.length;i++){
            System.out.printf(arr[i]+"\t");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        char m;
        Insert is = new Insert();
        String str = sc.nextLine();
        m = str.charAt(0);
        is.insert(arr,m);
        int flag = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==m){
                flag = i;
            }
            System.out.printf(arr[i]+"\t");
        }
        System.out.println();
        System.out.println("插入的位置是："+flag);
    }
}
