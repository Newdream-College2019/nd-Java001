package chapter13_2;

public class Math {
	public int add(int[] arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		return sum;
	}
	public int max(int[] arr){
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		Math math=new Math();
		int[] arr=new int[]{2,5,7,12,45,67};
		System.out.print("�������ֵΪ��");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.print("\n\n���������������֮��Ϊ��");
		System.out.println(math.add(arr));
		System.out.print("\n�������е����ֵΪ��");
		System.out.println(math.max(arr));
	}
}
