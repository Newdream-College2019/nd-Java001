public class Test01{
	public static void main(String[] args){
		String[] thing=new String[5];
		thing[0]="Nike背包";
		thing[1]="Adidas运动衫";
		thing[2]="李宁运动鞋";
		thing[3]="Kappa外套";
		thing[4]="361°腰包";
		System.out.println("本次活动特价商品有：");
		for(int i=0;i<thing.length;i++){
			System.out.println(thing[i]);
		}
	}
}