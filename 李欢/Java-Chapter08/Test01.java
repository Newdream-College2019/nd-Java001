public class Test01{
	public static void main(String[] args){
		int num=0;
		for(int i=1;i<=100;i++){
			num+=i;
			if(num>500){
				System.out.println("�ۼӵĺ��Ѵ���500����ʱ�Ѿ��ӵ�"+i);
				break;
			}
		}
	}
}