import java.util.*;
public class Test05{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double[] scores=new double[10];
		for(int i=0;i<scores.length;i++){
			System.out.print("�������"+(i+1)+"��ѧ���ķ���:");
			scores[i]=input.nextDouble();
		}
		int cs=0;
		int ls=0;
		int ys=0;
		double max=scores[0];
		double min=scores[0];
		double sum=0;
		for(int i=0;i<scores.length;i++){
			if(scores[i]<60){
				cs++;
			}else if(scores[i]>=80){
				ys++;
			}else{
				ls++;
			}
			if(scores[i]>max){
				max=scores[i];
			}
			if(scores[i]<min){
				min=scores[i];
			}
			sum+=scores[i];
		}
		System.out.println("�ɼ���60��������"+cs+"��");
		System.out.println("�ɼ���60~80��"+ls+"��");
		System.out.println("�ɼ���80��������"+ys+"��");
		System.out.println("��߷֣�"+max);
		System.out.println("��ͷ֣�"+min);
		System.out.println("ƽ���֣�"+(sum/scores.length));
	}
}