package course06.zuoye;

public class Test1_4 {
    public static void main(String[] args) {
        for (int i = 10000; i <= 99999; i++) {
            int gw = i % 10;
            int sw = (i / 10) % 10;
            int bw = (i / 100) % 10;
            int qw = (i / 1000) % 10;
            int ww = i / 10000;
            if (gw == ww && sw == qw) {
                System.out.println(i);
            }
        }
    }
}
