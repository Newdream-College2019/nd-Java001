package course09.zy;

import java.util.Scanner;

public class test5 {
    static void sort(double arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    double t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    public static void main(String[] args) {
        double arr[] = new double[10];
        Scanner sc = new Scanner(System.in);
        int bhg = 0, btw_6_8 = 0, good = 0;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
            if (arr[i] < 60) {
                bhg++;
            } else if ((arr[i] >= 60) && (arr[i] < 80)) {
                btw_6_8++;
            } else {
                good++;
            }
            sum+=arr[i];
        }
        sort(arr);
        System.out.println("最高分："+arr[arr.length-1]);
        System.out.println("最低分："+arr[0]);
        System.out.println("平均分为："+sum/10);
    }
}
