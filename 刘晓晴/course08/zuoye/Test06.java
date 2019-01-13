public class Test06{
	public static void main(String[] args){
		System.out.println("第一个：");
		for(int i=1;i<=4;i++){
			for(int j=1;j<=14;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("第二个：");
		int kg2=0;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=kg2;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=14;j++){
				System.out.print("*");
			}
			System.out.println();
			kg2++;
		}
		System.out.println();
		System.out.println("第三个：");
		for(int i=4;i>0;i--){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("第四个：");
		int kg4=0;
		int xx4=7;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=kg4;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=xx4;j++){
				System.out.print("*");
			}
			System.out.println();
			kg4++;
			xx4-=2;
		}
		System.out.println();
		System.out.println("第五个：");
		int kg5=0;
		int xx5=7;
		int zjg5=5;
		for(int i=4;i>0;i--){
			for(int j=1;j<=kg5;j++){
				System.out.print(" ");
			}
			if(i!=1&&i!=4){
				System.out.print("*");
				for(int j=zjg5;j>0;j--){
					System.out.print(" ");
				}
				System.out.print("*");
			}else{
				for(int j=xx5;j>0;j--){
					System.out.print("*");
				}
			}
			System.out.println();
			zjg5-=2;
			kg5++;
			xx5-=2;
				
		}
		System.out.println();
		System.out.println("第六个：");
		int kgs1=3;
		int xxs1=1;
		int zjgs1=-1;
		int kgs2=1;
		int xxs2=5;
		int zjgs2=3;
		for(int i=1;i<=7;i++){
			if(i<=4){
				for(int j=1;j<=kgs1;j++){
					System.out.print(" ");
				}
				if(i!=1&&i!=4){
					System.out.print("*");
					for(int j=1;j<=zjgs1;j++){
						System.out.print(" ");
					}
					System.out.print("*");
				}else{
					for(int j=1;j<=xxs1;j++){
						System.out.print("*");
					}
				}
				System.out.println();
				zjgs1+=2;
				kgs1--;
				xxs1+=2;
			}else{
				for(int j=1;j<=kgs2;j++){
					System.out.print(" ");
				}
				if(i!=7){
					System.out.print("*");
					for(int j=zjgs2;j>0;j--){
						System.out.print(" ");
					}
					System.out.print("*");
				}else{
					for(int j=xxs2;j>0;j--){
						System.out.print("*");
					}
				}
				System.out.println();
				zjgs2-=2;
				kgs2++;
				xxs2-=2;
			}
			
		}
	}
}