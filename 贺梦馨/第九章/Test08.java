import java.util.Scanner;
public class Test08{
	public static void main(String[] args){
		String[] arr={"pretty","ocean","sun","Island",null};
		Scanner in=new Scanner(System.in);
		System.out.print("ÇëÊäÈë¸èÃû");
		String answer=in.next();
		int index=0;
		for(int i=1;i<arr.length;i++){
			if(arr[i].compareToIgnoreCase(answer)>0){
				index=i;
				break;
			}
		}
		for(int i=1;i<arr.length-index;i++){
			int j=index;
			arr[j+1]=arr[j];
			j++;
		}
		arr[index]=answer;
		for(int i=1;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}