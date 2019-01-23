package chapter15;

public abstract class MotoVehicle {
	private String no;
	private String brand;
	public MotoVehicle() {
		
	}
	public MotoVehicle(String no,String brand) {
		this.no=no;
		this.setBrand(brand);
	}
	public abstract  int CalcRent(int days);
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}

}
