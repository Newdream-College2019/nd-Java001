package course06.zuoye;

public class Test1_2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            boolean b = true;
            if (i % 3 == 0) {
                System.out.printf("Flip");
                b = false;
            }
            if (i % 5 == 0) {
                System.out.printf("Flop");
                b = false;
            }
            if (b) {
                System.out.printf("%d", i);
            }
            System.out.println();
        }
    }
}
