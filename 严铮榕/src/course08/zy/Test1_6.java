package course08.zy;

public class Test1_6 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println("************");
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf(" ");
            }
            System.out.println("************");
        }
        System.out.println();
        for (int i = 4; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.printf("*");
            }
            System.out.println();
        }
        System.out.println();
        int flag = 7;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf(" ");
            }
            for (int k = 0; k < flag; k++) {
                System.out.printf("*");
            }
            flag -= 2;
            System.out.println();
        }
        System.out.println();
        /*int flag_2 = 7;
        for (int i = 1; i <= flag_2; i++) {
            for (int j = 0; j < flag_2-i; j++) {
                System.out.printf(" ");
            }
            for (int k = 1; k <= i*2-1; k++) {
                if((k==flag_2)||(k==1)){
                    System.out.printf("*");
                }else{
                    System.out.println(" ");
                }
            }
            System.out.println();
        }*/
    }
}
