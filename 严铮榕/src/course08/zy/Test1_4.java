package course08.zy;

public class Test1_4 {
    static int fun(int n) {
        if (n <= 1) {
            return 1;
        }
        else{
            return n * fun(n - 1);
        }
    }

    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<10;i++){
            sum+=fun(i);
        }
        System.out.println(sum);
    }
}
