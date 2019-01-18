package course06.zuoye;

public class Test1_5 {
    public static void main(String[] args) {
        for(int i = 100;i<=999;i++){
            int gw = i % 10;
            int sw = (i / 10) % 10;
            int bw = i / 100;
            int sum = gw*gw*gw+sw*sw*sw+bw*bw*bw;
            if(i==sum){
                System.out.println(i);
            }
        }
    }
}
