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
		System.out.print("该数组的值为：");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.print("\n\n该数组的所有数据之和为：");
		System.out.println(math.add(arr));
		System.out.print("\n该数组中的最大值为：");
		System.out.println(math.max(arr));
	}
}
