public class Test07{
	public static void main(String[] args){
		int[] array=new int[]{1,3,-1,5,-2};
		int[] newArray=new int[5];
		int j=4;
		System.out.print("array:");
		for(int i=0;i<array.length;i++){
			newArray[j]=array[i];
			j--;
			System.out.print(array[i]+" ");
		}
		System.out.print("\nnewArray:");
		for(int i=0;i<newArray.length;i++){
			if(newArray[i]<0){
				newArray[i]=0;
			}
			System.out.print(newArray[i]+" ");
		}
	}
}