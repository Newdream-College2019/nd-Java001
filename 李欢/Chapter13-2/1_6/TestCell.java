package chapter13_2;

public class TestCell {
	public static void main(String[] args) {
		Cell cell=new Cell();
		cell.brand="���ڵ��";
		cell.gl=20;
		cell.type="510i";
		cell.chong();
		cell.fang();
		System.out.println();
		
		System.out.println(cell.brand());
		System.out.println(cell.gong());
		System.out.println(cell.type());
		System.out.println(cell.toString());
		System.out.println();
		
		cell.brand("��ͨ���");
		cell.gong(34);
		cell.type("545f");
		
	}
}
