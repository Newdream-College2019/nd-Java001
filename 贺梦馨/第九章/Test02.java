import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		char[] arr={'a','c','u','b','e','p','f','z'};
		System.out.print("������һ����ĸ");
		boolean result=false;
		Scanner in=new Scanner(System.in);
		char a=in.next().charAt(0);//���ַ����л�ȡ��i����ĸ
		//String a=in.next();
		for(int i=0;i<arr.length;i++){
			//String b=arr[i]+"";
			char b=arr[i];
			if(a==b){
				System.out.print("�������д����������ĸ�������±�Ϊ"+i);
				result=true;
				break;
			}
			
		}
		if(!result){
		System.out.print("�������ĸ��������������");
		}
	}
}