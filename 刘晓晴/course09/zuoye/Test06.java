import java.util.*;
public class Test06{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int[] arr=new int[10];
		int ff=0;
		int sum=0;
		for(int i=0;i<arr.length;i++){
			System.out.print("\n������"+(i+1)+"������");
			arr[i]=input.nextInt();
			if(arr[i]!=1&&arr[i]!=2&&arr[i]!=3){
				System.out.print("\t\t"+arr[i]+"�ǷǷ�����");
				ff++;
			}else{
				sum++;
			}
		}
		System.out.println("\n�Ƿ������У�"+ff+"��\n�����У�"+sum+"��");
	}
}