public class Test07{
	public static void main(String[] args){
		int[] arr={1,3,-1,5,-2};
		int[] brr=new int[5];
		int num=arr.length/2;
		
		for(int i=2;i>=arr.length-i;i++){
			int j=0;
			brr[num+i]=arr[num+j];
			brr[num+j]=arr[num+i]
			j--;
		}
		for(int i=0;i<brr.length;i++){
			if(brr[i]<0){
				brr[i]=0;
			}
		}
		
		for(int i=0;i<brr.length;i++){
			System.out.print(brr[i]);
		}
	}
}