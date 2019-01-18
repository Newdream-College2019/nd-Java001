package course08.zy;

public class Test1_1 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1;i<=100;i++){
            if(sum>500){
                break;
            }
            sum+=i;
        }
        System.out.println(sum);
    }
}
