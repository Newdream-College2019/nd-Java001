package course13.zuoye;

public class Five {
	public void printTriangle(int row,String ch){
		for(int i=0;i<row;i++){
			for(int j=0;j<=i;j++){
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
