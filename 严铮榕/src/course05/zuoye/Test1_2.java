package course05.zuoye;

public class Test1_2 {
    public static void main(String[] args) {
        double fenmu = 1,fenzi = 0;
        int i = 1;
        while (i <= 20) {
            fenmu = fenmu * i * i;
            i++;
        }
        i=1;
        while (i <= 20) {
            fenzi += fenmu / (i * i);
            i++;
        }
        System.out.println(fenzi/fenmu);
    }
}
